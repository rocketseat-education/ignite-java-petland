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

import com.petland.cadastros.model.ProdutoServico;
import com.petland.cadastros.repository.ProdutoServicoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoServicoController {
    
    @Autowired
    private ProdutoServicoRepository repository;

    @GetMapping()
    public List<ProdutoServico> listar(){
        return repository.findAll();
    }

    @PostMapping()
    public Integer gravar(@RequestBody ProdutoServico requisicao){
        repository.save(requisicao);
        return requisicao.getId();
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable ("id") Integer id, 
                           @RequestBody ProdutoServico requisicao){
        requisicao.setId(id);
        repository.save(requisicao);
        return requisicao.getId();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id){
        repository.deleteById(id);
       
    }

    
}
