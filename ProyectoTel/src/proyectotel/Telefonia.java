/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotel;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Telefonia {
    private int id_factura;
    private String nombre;
    private int minutos;
    private int Telefono;
    private double costoMin;
    private String region;
    private double iva;
    private double ISeg;
    private double TotalImpuestos;
    private double total;
    private  DecimalFormat df = new DecimalFormat("#0.00");
    
     public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    
    public void facturaNacional(){
        if(minutos > 0 && minutos <= 50){
            costoMin = minutos * 0.01;
            iva = costoMin * 0.13;
            ISeg = costoMin * 0.05;
            TotalImpuestos = iva + ISeg;
            total = costoMin + TotalImpuestos + 0.4;
        }

        else if(minutos > 50 && minutos < 100){
            costoMin = ((50 * 0.01) + ((minutos - 50) * 0.09));
            ISeg = costoMin * 0.05;
            iva = costoMin * 0.13;
            TotalImpuestos = iva + ISeg;
            total = costoMin + TotalImpuestos + 0.4;   
        }

        else if(minutos >= 100){
            costoMin = ((50 * 0.01) + (50 * 0.09) + ((minutos - 100) * 0.10)); 
            iva = costoMin * 0.13;
            ISeg = costoMin * 0.05;
            TotalImpuestos = iva + ISeg;
            total = costoMin + TotalImpuestos + 0.4;
        }
    }      
    
    public void facturainternacional(){
        if(minutos > 0 && minutos <= 50){
            costoMin = minutos * 0.01;
            iva = costoMin * 0.13;
            ISeg = costoMin * 0.05;
            TotalImpuestos = iva + ISeg;
            total = costoMin + TotalImpuestos + 0.6;
        }

        else if(minutos > 50 && minutos < 100){
            costoMin = ((50 * 0.01) + ((minutos - 50) * 0.09));
            iva = costoMin * 0.13;
            ISeg = costoMin * 0.05;
            TotalImpuestos = iva + ISeg;
            total = costoMin + TotalImpuestos + 0.6;   
        }

        else if(minutos >= 100){
            costoMin = ((50 * 0.01) + (50 * 0.09) + ((minutos - 100) * 0.10)); 
            iva = costoMin * 0.13;
            ISeg = costoMin * 0.05;
            TotalImpuestos = iva + ISeg;
            total = costoMin + TotalImpuestos + 0.6;
        }
    }      
    
    @Override
    public String toString() {
       
        StringBuilder sb = new StringBuilder();
            sb.append("\n\t    >> Factura Telefonia <<\n");
            sb.append("\n\t  ID: ");
	        sb.append(id_factura);
	        sb.append("\n\t  Nombre: ");
	        sb.append(nombre);
	        sb.append("\n\t  Telefono: ");
	        sb.append(Telefono);
	        sb.append("\n\t  Minutos de llamada: ");
	        sb.append(minutos + " min");
	        sb.append("\n\t  Region: ");
	        sb.append(region);
	        sb.append("\n\t  Iva: ");
	        //sb.append(iva + " ctv");
	        sb.append(df.format(iva) + " ctv");
	        sb.append("\n\t  ISeg: ");
            //sb.append(ISeg + "ctv"); 
            sb.append(df.format(ISeg) + " ctv");
	        sb.append("\n\t  total Impuesto: ");
	        //sb.append(TotalImpuestos + " ctv");
            sb.append(df.format(TotalImpuestos) + " ctv");
	        sb.append("\n\t* Total: ");
	        //sb.append(total + " ctv");
	        sb.append(df.format(total) + " ctv");
	        return sb.toString();
    }
}
