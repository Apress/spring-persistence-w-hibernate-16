package com.apress.springpersistence.audiomanager.core.config;

import com.apress.springpersistence.audiomanager.web.config.WebConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableAsync;


@Configuration
@EnableAsync
@ComponentScan(basePackages = {"com.apress.springpersistence.audiomanager"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = WebConfiguration.class)
})
public class AudioManagerCoreConfig {
    //this should automatically pick up JPAConfig (based on autoscan above)

}
