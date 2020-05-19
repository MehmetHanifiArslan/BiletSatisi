/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hanifi
 */
public  class DbConnection {
    private Connection connection;
    
    public Connection connect(){
        
        try {
            Class.forName("org.postgresql.Driver");
            this.connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/BiletSatisi", "postgres", "hanifi");  
          System.out.println("baglanti basarili.");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return this.connection;
    }


}

