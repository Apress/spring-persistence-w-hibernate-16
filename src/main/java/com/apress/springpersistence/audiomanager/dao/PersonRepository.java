package com.apress.springpersistence.audiomanager.dao;

import com.apress.springpersistence.audiomanager.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
