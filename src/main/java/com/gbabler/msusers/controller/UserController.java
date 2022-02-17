package com.gbabler.msusers.controller;

import com.gbabler.msusers.model.domain.UserDomain;
import com.gbabler.msusers.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDomain> getAllUsers() {
        List<UserDomain> users = userService.getAllUsers();
        return users;
    }

    @GetMapping("/users/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public UserDomain getUserById(@PathVariable(name = "userId") Integer userId) {
        UserDomain user = userService.getUserById(userId);
        return user;
    }
}