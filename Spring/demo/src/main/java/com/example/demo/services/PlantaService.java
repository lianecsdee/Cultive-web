package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Planta;
import com.example.demo.repositories.PlantaRepository;


@Service
public class PlantaService {
    private final PlantaRepository plantaRepository;

    public PlantaService(PlantaRepository plantaRepository){
        this.plantaRepository = plantaRepository;
    }

    public List<Planta> listarPlantas(){
        return plantaRepository.findAll();
    }

    public Planta listarPlantaId(Long id){
        return plantaRepository.findById(id).orElseThrow();
    }

    public Planta adicionarPlanta(Planta planta){
        return plantaRepository.save(planta);
    }

    public void deletarPlanta(Long id){
        plantaRepository.deleteById(id);
    }
}
