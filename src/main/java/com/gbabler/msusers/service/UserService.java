package com.gbabler.msusers.service;

import com.gbabler.msusers.model.domain.UserDomain;
import com.gbabler.msusers.model.dto.UserRequest;
import com.gbabler.msusers.model.dto.UserResponse;
import com.gbabler.msusers.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserResponse> getAllUsers() {
        /**
         * Method Reference
         * userRepository.findAll() //List<UserDomain>
         *                 .stream() //Convertendo para Stream<UserDomain>
         *                 .map(UserResponse::valueOf) //Mapeando para Stream<UserResponse>
         *                 .collect(Collectors.toList()); // Convertendo tudo para List<UserResponse>
         */
        return userRepository.findAll()
                .stream()
                .map(userDomain -> UserResponse.valueOf(userDomain))
                .collect(Collectors.toList());
    }

    public UserDomain getUserById(Integer id) {
        Optional<UserDomain> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()) {
            return userOptional.get();
        } else {
            return null;
        }
    }

    public void createNewUser(UserRequest userRequest) {
        UserDomain newUserDomain = new UserDomain(userRequest.getId(), userRequest.getName(), userRequest.getAge());
        userRepository.save(newUserDomain);
    }

    public void deleteUserById(Integer id) {
        Optional<UserDomain> optionalUserDomain = userRepository.findById(id);
        if(optionalUserDomain.isPresent()) {
            userRepository.deleteById(id);
        }
    }

    public void updateUserById(Integer id, UserRequest userRequest) {
        Optional<UserDomain> optionalUserDomain = userRepository.findById(id);
        UserDomain userDomain;
        if(optionalUserDomain.isPresent()) {
            userDomain = optionalUserDomain.get();
            userDomain.setId(userRequest.getId());
            userDomain.setName(userRequest.getName());
            userDomain.setAge(userRequest.getAge());
        } else {
            userDomain = new UserDomain(userRequest.getId(), userRequest.getName(), userRequest.getAge());
        }
        userRepository.save(userDomain);
    }
}
