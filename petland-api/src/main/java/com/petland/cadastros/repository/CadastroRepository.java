package com.petland.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.cadastros.model.entity.CadastroEntity;

public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer>{
    
}
