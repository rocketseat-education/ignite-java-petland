package com.petland;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PetlandApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetlandApiApplication.class, args);
	}

	@GetMapping("/ola")
	public String dizerOla() {
		return "ola";
	}

}
