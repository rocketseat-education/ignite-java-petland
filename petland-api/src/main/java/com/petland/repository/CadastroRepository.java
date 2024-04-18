package com.petland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{
    
}
