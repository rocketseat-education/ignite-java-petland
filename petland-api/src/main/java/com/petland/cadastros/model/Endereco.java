package com.petland.cadastros.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Endereco {

    @Column(name = "logra", length = 50)
    private String logradouro;

    @Column(name = "nr", length = 6)
    private String numero;

}
