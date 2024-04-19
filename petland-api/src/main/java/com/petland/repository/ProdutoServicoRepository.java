package com.petland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.ProdutoServico;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServico, Integer>{
    
}
