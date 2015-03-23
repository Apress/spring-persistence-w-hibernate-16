package com.apress.springpersistence.audiomanager.core.service;

import com.apress.springpersistence.audiomanager.core.repository.UserRepository;
import com.apress.springpersistence.audiomanager.core.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = false)
    public void createUser(User user) {
        this.userRepository.save(user);
    }

}
