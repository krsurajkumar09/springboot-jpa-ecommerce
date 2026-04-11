package com.suraj.springboot_jpa_ecommerce.repository;


import com.suraj.springboot_jpa_ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}