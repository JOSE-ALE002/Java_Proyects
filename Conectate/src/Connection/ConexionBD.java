/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConexionBD {
    Connection conectar = null;
    public ConexionBD(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/Compra","root","admin");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return conectar;
    }
    
    public void desconectar(){
        conectar = null;
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

