package com.petland.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.petland.model.Cadastro;
import com.petland.model.Endereco;
import com.petland.model.Perfil;
import com.petland.repository.CadastroRepository;

@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private CadastroRepository repository;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Cadastro victor = new Cadastro();
        victor.setNome("Victor");
       
        Perfil perfil = new Perfil();
        perfil.setCliente(true);
        victor.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua das Flores");
        endereco.setNumero("123");
        victor.setEndereco(endereco);


        repository.save(victor);
    }
}
