package com.apress.springpersistence.audiomanager.test;

import com.apress.springpersistence.audiomanager.config.TestConf;
import com.apress.springpersistence.audiomanager.core.config.Profiles;
import com.apress.springpersistence.audiomanager.core.domain.AudioObject;
import com.apress.springpersistence.audiomanager.core.domain.Comment;
import com.apress.springpersistence.audiomanager.core.domain.Gender;
import com.apress.springpersistence.audiomanager.core.domain.Person;
import com.apress.springpersistence.audiomanager.core.domain.components.PersonName;
import com.apress.springpersistence.audiomanager.core.repository.AudioObjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

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
    private AudioObjectRepository audioObjectRepository;

    @Test
    public void testSaveAudioContent() {
        AudioObject audioObject = new AudioObject();
        audioObject.setName("test");
        Person person = new Person();
        PersonName name = new PersonName();
        name.setFirstName("Paul");
        name.setLastName("Fisher");
        person.setFullName(name);
        person.setGender(Gender.Male);
        person.setTelephone("212-555-1212");

        audioObject.setAuthor(person);
        Comment comment = new Comment();
        comment.setContent("test comment");
        audioObject.addComment(comment);
        audioObjectRepository.save(audioObject);
    }

}
