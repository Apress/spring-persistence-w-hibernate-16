package com.apress.springpersistence.audiomanager.dao;

import com.apress.springpersistence.audiomanager.domain.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CrudRepository<User, String> {


    public User findByUsernameAndPasswordHash(@Param("username") String username, @Param("passwordHash") String passwordHash);

    public Slice<User> findByPersonNameLastNameOrderByPersonNameLastNameAsc(@Param("lastName") String lastName, Pageable pageable);

    public Slice<User> findByPersonNameFirstNameOrderByPersonNameFirstNameAsc(@Param("firstName") String firstName, Pageable pageable);

    public Slice<User> findByPersonNameFirstNameAndPersonNameLastNameOrderByPersonNameLastNameAsc(@Param("firstName") String firstName,@Param("lastName") String lastName, Pageable pageable);



}
