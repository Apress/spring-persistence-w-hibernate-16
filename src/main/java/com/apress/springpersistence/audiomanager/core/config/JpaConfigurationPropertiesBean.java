package com.apress.springpersistence.audiomanager.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by pfisher on 2/12/16.
 */
@Component
@ConfigurationProperties(prefix = JpaConfigurationPropertiesBean.PREFIX)
public class JpaConfigurationPropertiesBean {

    public static final String PREFIX = "spring.jpa";

    private boolean showSql;
    private boolean formalSql;
    private Class hibernateImplicitNamingStrategy;
    private String connectionCharset;
    private String currentSessionContextClass;
    private String autodetection;
    private Class transactionManagerLookupClass;
    private String dialect;
    private String hbm2ddl;


    public boolean isShowSql() {
        return showSql;
    }

    public void setShowSql(boolean showSql) {
        this.showSql = showSql;
    }

    public boolean isFormalSql() {
        return formalSql;
    }

    public void setFormalSql(boolean formalSql) {
        this.formalSql = formalSql;
    }

    public Class getHibernateImplicitNamingStrategy() {
        return hibernateImplicitNamingStrategy;
    }

    public void setHibernateImplicitNamingStrategy(Class hibernateImplicitNamingStrategy) {
        this.hibernateImplicitNamingStrategy = hibernateImplicitNamingStrategy;
    }

    public String getConnectionCharset() {
        return connectionCharset;
    }

    public void setConnectionCharset(String connectionCharset) {
        this.connectionCharset = connectionCharset;
    }

    public String getCurrentSessionContextClass() {
        return currentSessionContextClass;
    }

    public void setCurrentSessionContextClass(String currentSessionContextClass) {
        this.currentSessionContextClass = currentSessionContextClass;
    }

    public String getAutodetection() {
        return autodetection;
    }

    public void setAutodetection(String autodetection) {
        this.autodetection = autodetection;
    }

    public Class getTransactionManagerLookupClass() {
        return transactionManagerLookupClass;
    }

    public void setTransactionManagerLookupClass(Class transactionManagerLookupClass) {
        this.transactionManagerLookupClass = transactionManagerLookupClass;
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getHbm2ddl() {
        return hbm2ddl;
    }

    public void setHbm2ddl(String hbm2ddl) {
        this.hbm2ddl = hbm2ddl;
    }
}
