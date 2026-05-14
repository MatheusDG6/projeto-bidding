/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bidding.system.bidding.repository;
import com.bidding.system.bidding.model.EditalDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aluno
 */
@Repository
public class EditalRepository {
    
    public int criar(EditalDTO novo) {
          try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conn.prepareStatement("INSERT INTO editais (titulo, descricao, data_fechamento, status) VALUES (?,?,?,?)");
            stmt.setString(1, novo.getTitulo());
            stmt.setString(2, novo.getDescricao());
            stmt.setDate(3, novo.getData_fechamento());
            stmt.setString(4, novo.getStatus());
            
            return stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    
    public List<EditalDTO> listar() {
        List<EditalDTO> editais = new ArrayList();
        
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM editais");
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                EditalDTO edital = new EditalDTO();
                edital.setTitulo(rs.getString("titulo"));
                edital.setDescricao(rs.getString("descricao"));
                edital.setData_fechamento(rs.getDate("data_fechamento"));
                edital.setStatus(rs.getString("status"));
                editais.add(edital);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return editais;
    }
}