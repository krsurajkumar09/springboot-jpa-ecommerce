package com.suraj.springboot_jpa_ecommerce.services;


import com.suraj.springboot_jpa_ecommerce.dto.UserRequestDTO;
import com.suraj.springboot_jpa_ecommerce.dto.UserResponseDTO;
import com.suraj.springboot_jpa_ecommerce.entity.User;
import com.suraj.springboot_jpa_ecommerce.mapper.UserMapper;
import com.suraj.springboot_jpa_ecommerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDTO createUser(UserRequestDTO request) {
        User user = UserMapper.toEntity(request);
        User saved = userRepository.save(user);
        return UserMapper.toDTO(saved);
    }

    public UserResponseDTO getUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return UserMapper.toDTO(user);
    }
}