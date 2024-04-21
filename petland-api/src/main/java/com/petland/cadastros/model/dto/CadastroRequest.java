package com.petland.cadastros.model.dto;

import com.petland.cadastros.model.Endereco;
import com.petland.cadastros.model.Perfil;

import lombok.Data;

@Data
public class CadastroRequest {
    private String nome;
    private Perfil perfil;
    private Endereco endereco;
}
