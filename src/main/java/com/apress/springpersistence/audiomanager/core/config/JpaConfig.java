package com.apress.springpersistence.audiomanager.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.*;
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
@EnableConfigurationProperties
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.apress.springpersistence.audiomanager.core.repository"})
@EntityScan({"com.apress.springpersistence.audiomanager.core.domain"})
@PropertySource("classpath:jpa.properties")
public class JpaConfig {

    @Autowired
    private Environment environment;

    @Autowired
    private DataSourceConfigurationPropertiesBean dataSourceProperties;

    @Autowired
    private JpaConfigurationPropertiesBean jpaConfigurationProperties;

    /**
     * This datasource will only be active when the EmbeddedDb profile is NOT active
     * @return
     */
    @Profile("!"+ Profiles.EmbeddedDb)
    @Bean
    public DataSource localDataSource() {
        DataSourceBuilder factory = DataSourceBuilder
                .create(this.getClass().getClassLoader())
                .driverClassName(this.dataSourceProperties.getDriverClassName())
                .url(this.dataSourceProperties.getUrl())
                .username(this.dataSourceProperties.getUsername())
                .password(this.dataSourceProperties.getPassword());
        return factory.build();
    }

    @Profile(Profiles.EmbeddedDb)
    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder.setType(EmbeddedDatabaseType.DERBY).build();
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
        lef.setDataSource(localDataSource());
        lef.setJpaVendorAdapter(jpaVendorAdapter());
        lef.setJpaDialect(jpaDialect());
        lef.setMappingResources();
        Properties props = new Properties();
        props.put("hibernate.show_sql", jpaConfigurationProperties.isShowSql());
        props.put("hibernate.format_sql", jpaConfigurationProperties.isFormalSql());
//        props.put("hibernate.ejb.naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringNamingStrategy");
        props.put("hibernate.implicit_naming_strategy", environment.getProperty("spring.jpa.hibernate.implicit_naming_strategy"));
        props.put("hibernate.connection.charSet", environment.getProperty("spring.jpa.conection.charset"));
        props.put("hibernate.current_session_context_class", jpaConfigurationProperties.getCurrentSessionContextClass());
        props.put("hibernate.archive.autodetection", jpaConfigurationProperties.getAutodetection());
        props.put("hibernate.transaction.manager_lookup_class", jpaConfigurationProperties.getTransactionManagerLookupClass());
        props.put("hibernate.dialect", jpaConfigurationProperties.getDialect());
        props.put("hibernate.hbm2ddl.auto", environment.getProperty("spring.jpa.hbm2ddl.auto"));
        lef.setJpaProperties(props);

        lef.afterPropertiesSet();

        return lef;
    }

    /**
     * This is for use with the persistece.xml persistence unit
     * @return
     */
/*    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean lef = new LocalEntityManagerFactoryBean();
        lef.setPersistenceUnitName("audioManager");
        lef.setJpaVendorAdapter(jpaVendorAdapter());
        lef.setJpaDialect(jpaDialect());
        return lef;
    }*/

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(jpaConfigurationProperties.isShowSql());
        hibernateJpaVendorAdapter.setGenerateDdl(true);
        hibernateJpaVendorAdapter.setDatabasePlatform(jpaConfigurationProperties.getDialect());

        return hibernateJpaVendorAdapter;
    }

    @Bean
    public JpaDialect jpaDialect() {
        JpaDialect jpaDialect = new HibernateJpaDialect();
        return jpaDialect;
    }


   @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();

       transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }

    //todo: add transaction managers


}
