package com.suraj.springboot_jpa_ecommerce.repository;


import com.suraj.springboot_jpa_ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}