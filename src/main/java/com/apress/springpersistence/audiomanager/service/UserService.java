package com.apress.springpersistence.audiomanager.service;

import com.apress.springpersistence.audiomanager.dao.AudioObjectRepository;
import com.apress.springpersistence.audiomanager.dao.UserRepository;
import com.apress.springpersistence.audiomanager.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
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
