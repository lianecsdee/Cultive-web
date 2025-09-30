package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Users;
import com.example.demo.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping
    public List<Users> listarUsuarios(){
        return userService.listarUsuarios();
    }

    @GetMapping("/id")
    public Users listarUsuarioId(@PathVariable Long id){
        return userService.listarUsuarioId(id);
    }

    @PostMapping
    public Users adicionarUsuario(@RequestBody Users user){
        return userService.adicionarUsuario(user);
    }

    @DeleteMapping
    public void deletarUsuario(@PathVariable Long id){
        userService.deletarUsuario(id);
    }

}
