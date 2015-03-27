package com.apress.springpersistence.audiomanager.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("com.apress.springpersistence.audiomanager.web")
public class WebConfiguration extends WebMvcConfigurerAdapter {


}
