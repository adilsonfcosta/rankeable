/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.modelo.Usuario;
import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cassi
 */
public class JdbcUsuarioDao implements CRUDUsuario {

    private Connection connection;
     

    public JdbcUsuarioDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }

    @Override
    public boolean existeUsuario(Usuario usuario) throws SQLException {
      String sql = "select * from usuarios where nome = ? and senha = ? ";        
       
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            
            ResultSet rs = stmt.executeQuery();
             // Se existir registr
            if (rs.next()){  
                
                return true;                 
                 // Existe o usuario  
             } else {
                 return false;
                 // Nao existe o usuario  
             }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }     
    }

    @Override
    public void alteraUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
