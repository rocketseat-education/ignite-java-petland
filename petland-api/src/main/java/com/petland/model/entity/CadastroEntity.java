package com.petland.model.entity;

import com.petland.model.Endereco;
import com.petland.model.Perfil;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "tab_cadastro")
@Data
public class CadastroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;
    
    @Column(length = 50, nullable = false)
    private String nome;

    @Embedded
    private Perfil perfil;

    @Embedded
    private Endereco endereco;

}
