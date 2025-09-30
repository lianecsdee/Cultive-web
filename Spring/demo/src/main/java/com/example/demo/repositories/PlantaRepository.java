package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Planta;

public interface PlantaRepository extends JpaRepository<Planta, Long>{
    
}
