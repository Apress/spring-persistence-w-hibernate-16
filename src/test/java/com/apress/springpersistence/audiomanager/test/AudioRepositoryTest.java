package com.apress.springpersistence.audiomanager.test;

import com.apress.springpersistence.audiomanager.config.TestConf;
import com.apress.springpersistence.audiomanager.core.config.Profiles;
import com.apress.springpersistence.audiomanager.core.domain.*;
import com.apress.springpersistence.audiomanager.core.domain.components.PersonName;
import com.apress.springpersistence.audiomanager.core.repository.MediaObjectRepository;
import com.apress.springpersistence.audiomanager.core.repository.PersonRepository;
import com.apress.springpersistence.audiomanager.core.service.PersonService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pfisher on 2/12/16.
 */
@ActiveProfiles({Profiles.Development, Profiles.Local})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {TestConf.class})
@WebAppConfiguration
@IntegrationTest
public class AudioRepositoryTest {

    @Autowired
    private MediaObjectRepository mediaObjectRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonService personService;

    @Test
    public void testSaveAudioContent() {
        MediaObject mediaObject = new MediaObject();
        mediaObject.setName("test");
        Person person = new Person();
        PersonName name = new PersonName();
        name.setFirstName("Paul");
        name.setLastName("Fisher");
        person.setFullName(name);
        person.setGender(Gender.Male);
        person.setTelephone("212-555-1212");

        personRepository.save(person);

        mediaObject.setAuthor(person);
        Comment comment = new Comment();
        comment.setContent("test comment");
        mediaObject.addComment(comment);
        mediaObjectRepository.save(mediaObject);
    }

    @Test
    public void testPersonService() {
        Person person = new Person();
        person.setEmail("paul@foo.com");
        PersonName name = new PersonName();
        name.setFirstName("Paul");
        name.setLastName("Fisher");
        person.setFullName(name);
        person.setGender(Gender.Male);
        person.setTelephone("212-555-1212");

        personRepository.save(person);
        Iterable<Person> found = personService.findPeopleByName("paul");
        List<Person> list = new ArrayList<Person>();
//        list.addAll(found);
        Assert.assertEquals("there should be one person found", found);
    }

}
