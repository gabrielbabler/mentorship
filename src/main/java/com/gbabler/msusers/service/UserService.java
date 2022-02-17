package com.gbabler.msusers.service;

import com.gbabler.msusers.model.domain.UserDomain;
import com.gbabler.msusers.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDomain> getAllUsers() {
        List<UserDomain> users = userRepository.findAll();
        return users;
    }

    public UserDomain getUserById(Integer id) {
        Optional<UserDomain> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()) {
            return userOptional.get();
        } else {
            return null;
        }
    }
}
