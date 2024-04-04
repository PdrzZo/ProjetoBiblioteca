package com.example.demo.repository;

import com.example.demo.model.LivroDidatico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroDidaticoRepository extends JpaRepository<LivroDidatico,Long> {
}