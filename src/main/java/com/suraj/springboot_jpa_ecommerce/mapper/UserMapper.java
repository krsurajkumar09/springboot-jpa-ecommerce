package com.suraj.springboot_jpa_ecommerce.mapper;


import com.suraj.springboot_jpa_ecommerce.dto.UserRequestDTO;
import com.suraj.springboot_jpa_ecommerce.dto.UserResponseDTO;
import com.suraj.springboot_jpa_ecommerce.entity.User;

public class UserMapper {

    public static User toEntity(UserRequestDTO dto) {
        return User.builder()
                .name(dto.name())
                .email(dto.email())
                .build();
    }

    public static UserResponseDTO toDTO(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}