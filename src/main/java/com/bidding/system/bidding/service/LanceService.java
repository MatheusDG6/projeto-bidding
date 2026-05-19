/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bidding.system.bidding.service;

import com.bidding.system.bidding.model.LanceDTO;
import com.bidding.system.bidding.model.UserDTO;
import com.bidding.system.bidding.repository.EditalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author Aluno
 */
@Service
public class LanceService {
    
    @Autowired
    private TokenService tokenService;
    
    @Autowired
    private EditalRepository editalRepository.getById(id);
    
    if(!edital.getStatus().equals("ABERTO")) {
        throw new ResponseStatusException(HttpStatusCode.valueOf(400), 
        "Você não pode criar lances para um edital fechado!");
    }
    
    if (edital.getDataFechamento().before(lance.getData_lance())) {
        throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Data do lance posterior ao fechamento!");
    }
    else {
}
    public void criarLance(Long id, LanceDTO lance, String token){
        if (tokenService.validarToken(token)) {
            UserDTO userLogado = tokenService.extrairClaims(token);
            
            if (!userLogado.getRole().equals("FORNECEDOR")) {
                throw new ResponseStatusException(Http.StatusCode.valueOf(403), "Você precisa ser fornecedor para cadastrar um lance");
            }
            
            EditalDTO edital = 
        }
        else {
            throw new ResponseStatusException(HttpStatusCode.valueOf(401), "Token Inválido");
        }
        
    }
}
