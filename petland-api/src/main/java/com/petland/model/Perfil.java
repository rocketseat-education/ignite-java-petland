package com.petland.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Perfil {

    private boolean cliente;
    private boolean fornecedor;
    private boolean prestador;

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    public boolean isFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(boolean fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isPrestador() {
        return prestador;
    }

    public void setPrestador(boolean prestador) {
        this.prestador = prestador;
    }
}
