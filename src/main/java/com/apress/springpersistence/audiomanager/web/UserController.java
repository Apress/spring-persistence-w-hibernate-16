/*
package com.apress.springpersistence.audiomanager.controllers;

import com.apress.springpersistence.audiomanager.domain.AudioObject;
import com.apress.springpersistence.audiomanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users/create")
    @ResponseBody
    @Transactional(readOnly = false)
    public void (@RequestParam("page") Integer page) {
        return this.userService.createUser(user);

    }
}
*/
