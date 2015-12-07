package com.apress.springpersistence.audiomanager.core.config;

import com.apress.springpersistence.audiomanager.web.config.WebConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.context.support.StandardServletEnvironment;


@Configuration
@EnableAsync
@PropertySources(value = {@PropertySource("classpath:application.properties")})
@ComponentScan(basePackages = {"com.apress.springpersistence.audiomanager"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = WebConfiguration.class)
})
public class AudioManagerCoreConfig {
    //this should automatically pick up JPAConfig (based on autoscan above)
   /*  @Bean
    public Environment environment() {
        Environment environment = new StandardServletEnvironment();
         return environment;
     }*/
}
