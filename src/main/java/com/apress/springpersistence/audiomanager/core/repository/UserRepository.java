package com.apress.springpersistence.audiomanager.core.repository;

import com.apress.springpersistence.audiomanager.core.domain.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CrudRepository<User, String> {


    public User findByUsernameAndPasswordHash(@Param("username") String username, @Param("passwordHash") String passwordHash);

    public Slice<User> findByPersonPersonNameLastNameOrderByPersonPersonNameLastNameAsc(@Param("lastName") String lastName, Pageable pageable);

    public Slice<User> findByPersonPersonNameFirstNameOrderByPersonPersonNameFirstNameAsc(@Param("firstName") String firstName, Pageable pageable);

    public Slice<User> findByPersonPersonNameFirstNameAndPersonPersonNameLastNameOrderByPersonPersonNameLastNameAsc(@Param("firstName") String firstName,@Param("lastName") String lastName, Pageable pageable);



}
