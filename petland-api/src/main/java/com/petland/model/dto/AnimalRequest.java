package com.petland.model.dto;

import java.time.LocalDate;

import com.petland.model.AnimalEspecie;

import lombok.Data;

@Data
public class AnimalRequest {
    private String nome;  
    private LocalDate aniversário;
    private AnimalEspecie especie;
}
