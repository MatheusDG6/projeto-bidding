/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bidding.system.bidding.controller;

import com.bidding.system.bidding.model.EditalDTO;
import com.bidding.system.bidding.service.EditalService;
import com.bidding.system.bidding.service.TokenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */
@RestController
@RequestMapping("/api/editais")
public class EditalController {
    
    @Autowired
    private EditalService service;
    
    @PostMapping
    public String cadastrarEdital(
            @RequestHeader("Authorization") String auth,
            @RequestBody EditalDTO edital
    ){
        String token = auth.replace("Bearer ", "");
        service.criarEdital(edital, token);
        
        return "Edital Cadastrado com sucesso!";
    }
    
    @GetMapping
        public List<EditalDTO> listar(EditalDTO edital) {
        List<EditalDTO> lista = service.listar();
        return lista;
    }
}