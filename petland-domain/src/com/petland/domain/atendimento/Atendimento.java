package com.petland.domain.atendimento;

import com.petland.domain.cadastro.Animal;
import com.petland.domain.cadastro.Cadastro;
import com.petland.domain.cadastro.ProdutoServico;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {

    private Integer id;
    private AtendimentoTipo tipo;
    private AtendimentoStatus status;
    private String descricao;
    private LocalDate data;
    private LocalTime hora;

    private Cadastro solicitante;
    private ProdutoServico servico;
    private Animal paciente;
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AtendimentoTipo getTipo() {
        return tipo;
    }

    public void setTipo(AtendimentoTipo tipo) {
        this.tipo = tipo;
    }

    public AtendimentoStatus getStatus() {
        return status;
    }

    public void setStatus(AtendimentoStatus status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Cadastro getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Cadastro solicitante) {
        this.solicitante = solicitante;
    }

    public ProdutoServico getServico() {
        return servico;
    }

    public void setServico(ProdutoServico servico) {
        this.servico = servico;
    }

    public Animal getPaciente() {
        return paciente;
    }

    public void setPaciente(Animal paciente) {
        this.paciente = paciente;
    }
}
