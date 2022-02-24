package com.gbabler.msusers.controller;

import com.gbabler.msusers.model.domain.UserDomain;
import com.gbabler.msusers.model.dto.UserRequest;
import com.gbabler.msusers.model.dto.UserResponse;
import com.gbabler.msusers.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponse> getAllUsers() {
        List<UserResponse> users = userService.getAllUsers();
        return users;
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public UserDomain getUserById(@PathVariable(name = "userId") Integer userId) {
        UserDomain user = userService.getUserById(userId);
        return user;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewUser(@RequestBody UserRequest userRequest) {
        userService.createNewUser(userRequest);
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUserById(@PathVariable(name = "userId") Integer userId, @RequestBody UserRequest userRequest) {
        userService.updateUserById(userId, userRequest);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUserById(@PathVariable(name = "userId") Integer userId) {
        userService.deleteUserById(userId);
    }
}