package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor,Long> {
    
}
