package com.apress.springpersistence.audiomanager.core.service.impl;

import com.apress.springpersistence.audiomanager.core.domain.Person;
import com.apress.springpersistence.audiomanager.core.domain.QPerson;
import com.apress.springpersistence.audiomanager.core.repository.PersonRepository;
import com.apress.springpersistence.audiomanager.core.service.PersonService;
import com.mysema.query.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;


/**
 * Created by pfisher on 3/24/16.
 */
@Service
public class PersonServiceImpl implements PersonService {

    PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional(readOnly = true)
    public Iterable<Person> findPeopleByName(String nameOrEmail) {
        Predicate searchPredicate = QPerson.person.personName.fullName.containsIgnoreCase(nameOrEmail).or(QPerson.person.email.equalsIgnoreCase(nameOrEmail));

        return personRepository.findAll(searchPredicate);
    }

}
