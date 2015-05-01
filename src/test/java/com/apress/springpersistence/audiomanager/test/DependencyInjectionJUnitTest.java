package com.apress.springpersistence.audiomanager.test;

import com.apress.springpersistence.audiomanager.core.domain.Person;
import com.apress.springpersistence.audiomanager.core.domain.components.PersonName;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.apress.springpersistence.audiomanager.core.repository.PersonRepository;
import com.apress.springpersistence.audiomanager.AudioManagerApplication;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = AudioManagerApplication.class)
public class DependencyInjectionJUnitTest {
    Person person;

    @Autowired
    PersonRepository personRepository;

    @Before
    public void setUp() {
        PersonName personName = new PersonName();
        personName.setFirstName("Test");
        personName.setLastName("User");

        person = new Person();
        person.setFullName(personName);
        personRepository.save(person);
    }

    @After
    public void tearDown() {
        personRepository.delete(person);
        person = null;
    }

    @Test
    public void testPersonPersisted() {
        Assert.assertEquals(1, this.personRepository.count());
    }

}
