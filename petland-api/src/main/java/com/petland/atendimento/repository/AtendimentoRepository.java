package com.petland.atendimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.atendimento.model.entity.AtendimentoEntity;

public interface AtendimentoRepository extends JpaRepository<AtendimentoEntity, Integer>{
}
