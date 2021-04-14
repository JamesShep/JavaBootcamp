package com.coderscampus.week13.web;

import com.coderscampus.week13.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /*@Autowired
    private UserService userService;*/

    private UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/users")
    public String getUsers () {
        return userService.getMessage();
    }
}
