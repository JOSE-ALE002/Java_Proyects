/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectsqlite;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

/**
 *
 * @author joseibanez
 */
public class Consultas {
    
    public static void Mostrar(){
        Conexion con = new Conexion();
        Connection connect = con.getConection();
        ResultSet result = null;
        try { 
            PreparedStatement st = connect.prepareStatement("SELECT * FROM tabla1");
            result = st.executeQuery();
            while (result.next()) {
                System.out.print("ID: ");
                System.out.println(result.getInt("id"));

                System.out.print("Nombre: ");
                System.out.println(result.getString("nombre"));

                System.out.print("Pais: ");
                System.out.println(result.getString("Pais"));

                System.out.println("=======================");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    
    public static void Mostrar(PreparedStatement st){
        ResultSet result = null;
        try { 
            result = st.executeQuery();
            while (result.next()) {
                System.out.print("ID: ");
                System.out.println(result.getInt("id"));

                System.out.print("Nombre: ");
                System.out.println(result.getString("nombre"));

                System.out.print("Pais: ");
                System.out.println(result.getString("Pais"));

                System.out.println("=======================");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static void escribir(){
        Conexion con = new Conexion();
        Connection connect = con.getConection();
        
        try{
            Scanner entrada = new Scanner(System.in);

            System.out.println("\n\nIngrese el nombre: ");
            String nombre = entrada.next();

            System.out.println("Ingrese el pais: ");
            String pais = entrada.next();

            PreparedStatement st = connect.prepareStatement("INSERT INTO tabla1 VALUES(NULL, ?, ?)");
            st.setString(1, nombre);
            st.setString(2, pais);
            st.execute();
            
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public static void modificar(){
        Conexion con = new Conexion();
        Connection connect = con.getConection();
        
        try{
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Que fila desea modificar: ");
            int fila = entrada.nextInt();
            
            System.out.println("Ingrese el nombre: ");
            String nombre = entrada.next();

            System.out.println("Ingrese el pais: ");
            String pais = entrada.next();

            PreparedStatement st = connect.prepareStatement("UPDATE tabla1 SET nombre = ?, Pais = ? WHERE id IS ?");
            st.setString(1, nombre);
            st.setString(2, pais);
            st.setInt(3, fila);
            st.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public static void Eliminar(){
        Conexion con = new Conexion();
        Connection connect = con.getConection();
        
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.println("\n\nQue fila desea eliminar: ");
            int fila = entrada.nextInt();
            
            PreparedStatement st = connect.prepareStatement("DELETE FROM tabla1 WHERE id IS ?");
            st.setInt(1, fila);
            st.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public static void Buscar(){
        Conexion con = new Conexion();
        Connection connect = con.getConection();
        
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.print("\n\nIntroduzca nombre:  ");
            String name = entrada.next();
            
           PreparedStatement st = connect.prepareStatement("SELECT * FROM tabla1 WHERE nombre LIKE ? or Pais LIKE ?");
            st.setString(1, name);
            st.setString(2, name);
            st.execute();
            
            Mostrar(st);
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
}