package com.apress.springpersistence.audiomanager.dao;

import com.apress.springpersistence.audiomanager.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}
