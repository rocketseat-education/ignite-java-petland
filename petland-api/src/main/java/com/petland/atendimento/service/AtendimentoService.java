package com.petland.atendimento.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.atendimento.model.dto.AtendimentoRequest;
import com.petland.atendimento.model.entity.AtendimentoEntity;
import com.petland.atendimento.repository.AtendimentoRepository;

@Service
public class AtendimentoService {
    
    @Autowired
    private AtendimentoRepository repository;

    public Integer gravar(AtendimentoRequest requisicao){
        AtendimentoEntity entidade = new AtendimentoEntity();
        BeanUtils.copyProperties(requisicao, entidade);
        return repository.save(entidade).getId();
    }
}
