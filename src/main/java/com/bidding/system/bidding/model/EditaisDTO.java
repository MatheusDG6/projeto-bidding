/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bidding.system.bidding.model;
import java.time.LocalDateTime;


/**
 *
 * @author Aluno
 */
public class EditaisDTO {
    private String titulo;
    private String descricao;
    private LocalDateTime data_fechamento;

    public EditaisDTO() {
    }

    public EditaisDTO(String titulo, String descricao, LocalDateTime data_fechamento) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_fechamento = data_fechamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData_fechamento() {
        return data_fechamento;
    }

    public void setData_fechamento(LocalDateTime data_fechamento) {
        this.data_fechamento = data_fechamento;
    }
    
    
}
