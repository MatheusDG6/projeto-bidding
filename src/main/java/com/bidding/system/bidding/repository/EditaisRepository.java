/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bidding.system.bidding.repository;
import com.bidding.system.bidding.model.EditaisDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aluno
 */
@Repository
public class EditaisRepository {
    
    public void register(EditaisDTO editais) {
          try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conn.prepareStatement("INSERT INTO editais (titulo, descricao, data_contratacao) VALUES (?,?,?)");
            stmt.setString(1, editais.getTitulo());
            stmt.setString(2, editais.getDescricao());
            stmt.setString(3, editais.getData_contratacao());
            
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas == 0) {
                throw new SQLException("Falha na atualização - Nenhuma linha foi afetada");
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}