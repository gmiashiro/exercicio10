package com.exercicios.exercicio.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // definir que uma classe é uma tabela de um banco de dados relacional
@Table(name = "tb_tarefa") // Alterar o nome da tabela do banco de dados
public class TarefaModel {

    @Id //definir a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // informar ao banco de dados que ele deve preencher automaticamente um valor a ser preenchido na chave primaria
    private Long id;
    private String descricao;
    private LocalDate dataVencimento;
    private Boolean concluido;

    public TarefaModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}
