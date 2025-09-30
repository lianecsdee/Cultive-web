package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.EstufaDTO;
import com.example.demo.models.Estufa;
import com.example.demo.models.Planta;
import com.example.demo.models.Users;
import com.example.demo.repositories.EstufaRepository;
import com.example.demo.repositories.PlantaRepository;
import com.example.demo.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EstufaService {
    private final EstufaRepository estufaRepository;
    private final PlantaRepository plantaRepository;
    private final UserRepository userRepository;

    public List<Estufa> listarEstufas(){
        return estufaRepository.findAll();
    }

    public Estufa listarEstufaId(Long id){
        return estufaRepository.findById(id).orElseThrow();
    }

    public Estufa criarEstufa(EstufaDTO estufadto){
        Planta planta = plantaRepository.findById(estufadto.getTipoId()).orElseThrow();
        Users user = userRepository.findById(estufadto.getUserId()).orElseThrow();
        Estufa estufa = new Estufa();
        estufa.setNome(estufadto.getNome());
        estufa.setTipo(planta);
        estufa.setUsuario(user);
        return estufaRepository.save(estufa);
    }

    public void deletarEstufa(Long id){
        estufaRepository.deleteById(id);
    }
}
