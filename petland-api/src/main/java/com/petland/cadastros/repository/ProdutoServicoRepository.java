package com.petland.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.cadastros.model.ProdutoServico;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServico, Integer>{
    
}
