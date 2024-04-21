package com.petland.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.cadastros.model.entity.AnimalEntity;


public interface AnimalRepository  extends JpaRepository<AnimalEntity, Integer>{
} 