package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Users;
import com.example.demo.repositories.UserRepository;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public List<Users> listarUsuarios(){
        return userRepository.findAll();
    }

    public Users listarUsuarioId(Long id){
        return userRepository.findById(id).orElseThrow();
    }

    public Users adicionarUsuario(Users user){
        return userRepository.save(user);
    }

    public void deletarUsuario(Long id){
        userRepository.deleteById(id);
    }
}
