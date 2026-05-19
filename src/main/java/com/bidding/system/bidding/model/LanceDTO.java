/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bidding.system.bidding.model;

import java.sql.Date;

/**
 *
 * @author Aluno
 */
public class LanceDTO {
    private Long id;
    private double valor;
    private Date data_lance;
    private long idFinal;
    private long idUsuario;

    public LanceDTO() {
    }

    public LanceDTO(Long id, double valor, Date data_lance, long idFinal, long idUsuario) {
        this.id = id;
        this.valor = valor;
        this.data_lance = data_lance;
        this.idFinal = idFinal;
        this.idUsuario = idUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData_lance() {
        return data_lance;
    }

    public void setData_lance(Date data_lance) {
        this.data_lance = data_lance;
    }

    public long getIdFinal() {
        return idFinal;
    }

    public void setIdFinal(long idFinal) {
        this.idFinal = idFinal;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
}
