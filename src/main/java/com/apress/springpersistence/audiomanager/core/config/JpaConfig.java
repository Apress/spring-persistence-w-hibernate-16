package com.apress.springpersistence.audiomanager.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import javax.transaction.SystemException;
import java.util.Properties;

@Configuration
//@Profile("jpa")
@EnableJpaRepositories("com.apress.springpersistence.audiomanager.core")
@EnableConfigurationProperties
@EnableTransactionManagement
@PropertySource("classpath:jpa.properties")
public class JpaConfig {

    @Autowired
    private Environment environment;

    @Autowired
    private DataSourceConfigurationPropertiesBean dataSourceProperties;

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DataSource dataSource() {
        DataSourceBuilder factory = DataSourceBuilder
                .create(this.getClass().getClassLoader())
                .driverClassName(this.dataSourceProperties.getDriverClassName())
                .url(this.dataSourceProperties.getUrl())
                .username(this.dataSourceProperties.getUsername())
                .password(this.dataSourceProperties.getPassword());
        return factory.build();
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
        lef.setDataSource(dataSource());
        lef.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        lef.setJpaDialect(new HibernateJpaDialect());
        String[] packages = environment.getProperty("jpa.entities.package").split(",");
        lef.setPackagesToScan(packages);

        Properties props = new Properties();
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.format_sql", "true");
        props.put("hibernate.ejb.naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringNamingStrategy");
        props.put("hibernate.connection.charSet", "UTF-8");
        props.put("hibernate.current_session_context_class", "jta");
        props.put("hibernate.archive.autodetection", "class");
        props.put("hibernate.transaction.manager_lookup_class", "org.springframework.orm.hibernate5.HibernateTransactionManager");
        props.put("hibernate.dialect", environment.getProperty("jpa.dialect"));
        props.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
        lef.setJpaProperties(props);

        lef.afterPropertiesSet();

        return lef;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(false);
        hibernateJpaVendorAdapter.setGenerateDdl(true);
        hibernateJpaVendorAdapter.setDatabasePlatform(environment.getProperty("jpa.dialect"));

        return hibernateJpaVendorAdapter;
    }

   @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
       transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

    //todo: add transaction managers


}
