package com.apress.springpersistence.audiomanager.core.service;

import com.apress.springpersistence.audiomanager.core.domain.Person;

public interface PersonService {

    public Iterable<Person> findPeopleByName(String nameOrEmail);
}
