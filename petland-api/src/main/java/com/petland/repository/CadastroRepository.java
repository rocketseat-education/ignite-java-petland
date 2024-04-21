package com.petland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.entity.CadastroEntity;

public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer>{
    
}
