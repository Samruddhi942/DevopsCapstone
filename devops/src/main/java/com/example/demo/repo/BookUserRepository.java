package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BookUser;

public interface BookUserRepository extends JpaRepository<BookUser, Long> {
}

