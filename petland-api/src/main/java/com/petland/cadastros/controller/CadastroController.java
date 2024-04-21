package com.petland.cadastros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.cadastros.model.dto.CadastroRequest;
import com.petland.cadastros.model.dto.CadastroResponse;
import com.petland.cadastros.service.CadastroService;



@RestController
@RequestMapping("/cadastros")
public class CadastroController {

    @Autowired
    private CadastroService service;
    

    @GetMapping
    public List<CadastroResponse> get(){
        return service.listar();
    }

    @PostMapping()
    public Integer gravar(@RequestBody CadastroRequest requisicao){
        return service.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable ("id") Integer id, 
                           @RequestBody CadastroRequest requisicao){
        return service.alterar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id){
        service.excluir(id);      
    }
}
