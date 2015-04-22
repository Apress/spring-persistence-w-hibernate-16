package com.apress.springpersistence.audiomanager.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.apress.springpersistence.audiomanager.dao.PersonRepository;
import com.apress.springpersistence.audiomanager.AudioManagerApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AudioManagerApplication.class)
public class DependencyInjectionJUnitTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    public void testPerson() {
        // insert test logic here
    }

}
