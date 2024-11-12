package com.zunigatomas.barilibro.user_service.utils;

import com.zunigatomas.barilibro.user_service.dto.UserDTO;
import com.zunigatomas.barilibro.user_service.model.User;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getRole()
        );
    }

    public static User toEntity(UserDTO userDTO) {
        return new User(
                userDTO.getId(),
                userDTO.getUsername(),
                userDTO.getEmail(),
                userDTO.getPassword(),
                userDTO.getRole()
        );
    }
}