package com.projeto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.entidades.Analista;

@Repository
public interface AnalistaRepositorio  extends JpaRepository<Analista, Long> {
    
}