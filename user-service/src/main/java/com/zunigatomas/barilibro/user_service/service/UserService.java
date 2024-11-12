package com.zunigatomas.barilibro.user_service.service;

import com.zunigatomas.barilibro.user_service.dto.UserDTO;
import com.zunigatomas.barilibro.user_service.model.User;
import com.zunigatomas.barilibro.user_service.repository.UserRepository;
import com.zunigatomas.barilibro.user_service.utils.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserDTO userDTO) {
        return userRepository.save(UserMapper.toEntity(userDTO));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(String id, UserDTO userDTO) {
        User user = getUserById(id);
        if(user != null) {
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            user.setEmail(userDTO.getEmail());
            user.setRole(userDTO.getRole());
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}