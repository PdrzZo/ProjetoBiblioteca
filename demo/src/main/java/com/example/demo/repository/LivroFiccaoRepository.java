package com.example.demo.repository;

import com.example.demo.model.LivroFiccao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroFiccaoRepository extends JpaRepository<LivroFiccao, Long> {
}