package com.apress.springpersistence.audiomanager.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = DataSourceConfigurationPropertiesBean.PREFIX)
public class DataSourceConfigurationPropertiesBean {

    public static final String PREFIX = "datasource";

    private String username;
    private String url;
    private String password;
    private String driverClassName;
    private JpaDialect jpaDialect;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
