package com.example.pms_backend.Pharmacy.mapper;

import com.example.pms_backend.Pharmacy.dto.UserDTO;
import com.example.pms_backend.Pharmacy.model.User;

public class UserMapper {
    public static UserDTO mapToUserDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getUserName(),
                user.getEmail(),
                user.getPassword()
        );
    }

    public static User mapToUser(UserDTO userDTO) {
        return new User(
                userDTO.getId(),
                userDTO.getUserName(),
                userDTO.getEmail(),
                userDTO.getPassword()
        );
    }
}

