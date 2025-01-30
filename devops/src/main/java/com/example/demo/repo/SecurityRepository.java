package com.example.demo.repo;

import java.security.Security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<com.example.demo.model.Security, Long> {
}

