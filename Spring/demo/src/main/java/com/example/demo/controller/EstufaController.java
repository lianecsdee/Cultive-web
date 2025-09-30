package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.EstufaDTO;
import com.example.demo.models.Estufa;
import com.example.demo.services.EstufaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/estufas")
@RequiredArgsConstructor
public class EstufaController {
    private final EstufaService estufaService;

    @GetMapping
    public List<Estufa> listarEstufas(){
        return estufaService.listarEstufas();
    }

    @GetMapping("/id")
    public Estufa listarEstufaId(@PathVariable Long id){
        return estufaService.listarEstufaId(id);
    }

    @PostMapping
    public Estufa adicionarEstufa(@RequestBody EstufaDTO estufa){
        return estufaService.criarEstufa(estufa);
    }

    @DeleteMapping("/id")
    public void deletarEstufa(@PathVariable Long id){
        estufaService.deletarEstufa(id);
    }
}
