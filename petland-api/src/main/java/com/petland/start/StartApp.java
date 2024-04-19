package com.petland.start;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.petland.model.Animal;
import com.petland.model.AnimalEspecie;
import com.petland.repository.AnimalRepository;

@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private AnimalRepository repository;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        
        Animal snoop = new Animal();
        snoop.setNome("Snoop");
        snoop.setAniversário(LocalDate.of(2015, 10, 10));
        snoop.setEspecie(AnimalEspecie.CACHORRO);

        repository.save(snoop);
    }
}
