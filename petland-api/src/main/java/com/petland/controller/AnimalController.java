package com.petland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.model.Animal;
import com.petland.repository.AnimalRepository;

@RestController
public class AnimalController {
    
    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/animais")
    public List<Animal> listar(){
        return animalRepository.findAll();
    }
}
