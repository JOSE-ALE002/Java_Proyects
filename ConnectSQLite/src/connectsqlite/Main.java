/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectsqlite;

import java.util.Scanner;

/**
 *
 * @author joseibanez
 */
public class Main {
    
    public static void main(String args[]){
        int resp;
            
        do{
            resp = menu();
            
            switch(resp){
                case 1:{
                    Consultas.escribir();
                    break;
                }
                
                case 2:{
                    Consultas.Mostrar();
                    break;
                }
                
                case 3:{
                    Consultas.Eliminar();
                    break;
                }
                
                case 4:{
                    Consultas.modificar();
                    break;
                }
                
                case 5:{
                    Consultas.Buscar();
                    break;
                }
                
                case 6:{
                    System.out.println("\n\n¡Que tenga un buen dia!");
                    break;
                }
            }
        }while(resp != 6);
    }
    
    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\t\t>> Menu Principal << \n\n"
                + "\t1. Agregar Registro \n"
                + "\t2. Mostrar Registros \n"
                + "\t3. Eliminar Registro \n"
                + "\t4. Modificar Registo \n"
                + "\t5. Buscar Registro \n"
                + "\t6. Salir\n\n"
                + "\tIngrese una opcion: ");

        int resp = entrada.nextInt();
        return resp;
    }
}
