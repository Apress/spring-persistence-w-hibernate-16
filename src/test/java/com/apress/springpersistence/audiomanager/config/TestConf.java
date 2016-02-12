package com.apress.springpersistence.audiomanager.config;

import com.apress.springpersistence.audiomanager.core.config.AudioManagerCoreConfig;
import com.apress.springpersistence.audiomanager.core.config.JpaConfig;
import com.sun.tools.javac.sym.Profiles;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by pfisher on 2/12/16.
 */
@SpringBootApplication
@Import({AudioManagerCoreConfig.class})
@TestPropertySource({"classpath:test.properties"}) // this will takeprecedence over other properties
@ComponentScan(basePackages = {"com.apress.springpersistence.audiomanager"})
public class TestConf {
}
