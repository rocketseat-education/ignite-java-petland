package com.petland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.model.dto.AnimalResponse;
import com.petland.service.AnimalService;

@RestController
public class AnimalController {
    
    @Autowired
    private AnimalService service;
    

    @GetMapping("/animais")
    public List<AnimalResponse> get(){
        return service.listar();
    }
}
