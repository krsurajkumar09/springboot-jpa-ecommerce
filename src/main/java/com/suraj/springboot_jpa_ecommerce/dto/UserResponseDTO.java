package com.suraj.springboot_jpa_ecommerce.dto;

public record UserResponseDTO(
        Long id,
        String name,
        String email
) {}