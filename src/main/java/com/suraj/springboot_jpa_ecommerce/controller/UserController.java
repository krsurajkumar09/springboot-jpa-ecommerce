package com.suraj.springboot_jpa_ecommerce.controller;

import com.suraj.springboot_jpa_ecommerce.dto.UserRequestDTO;
import com.suraj.springboot_jpa_ecommerce.dto.UserResponseDTO;
import com.suraj.springboot_jpa_ecommerce.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponseDTO create(@RequestBody UserRequestDTO request) {
        return userService.createUser(request);
    }

    @GetMapping("/{id}")
    public UserResponseDTO get(@PathVariable Long id) {
        return userService.getUser(id);
    }
}