/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author cassiele
 */
public class JdbcVotoDao {
    
    private Connection connection;
    
     public JdbcVotoDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }
     
     
}
