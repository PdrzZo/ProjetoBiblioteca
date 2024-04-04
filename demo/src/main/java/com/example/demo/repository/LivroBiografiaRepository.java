package com.example.demo.repository;

import com.example.demo.model.LivroBiografia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroBiografiaRepository extends JpaRepository<LivroBiografia, Long> {
}