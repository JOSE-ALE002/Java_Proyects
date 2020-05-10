/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectsqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Conexion {
    
    String url = "example.db";
    Connection connect = null;

    public Conexion() {
         try {
            connect = DriverManager.getConnection("jdbc:sqlite:"+url);
            if (connect!=null) {
                System.out.println("Conectado");
            }
        }catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
        }
    }
  
    public Connection getConection(){
        return connect;
    }
}

