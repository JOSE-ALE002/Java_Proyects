package Interfaz;

import javax.swing.table.DefaultTableModel;

import Modelo.Empleado;

//clase que actura como el modelo de vista de todas las tablas del programa
@SuppressWarnings("serial")
public class ModeloTabla extends DefaultTableModel {
	 
	public ModeloTabla() //Constructor
	{
		
	}
	
	public ModeloTabla(Object[][] data, Object[] columnsNames) //Constructor sobrecargada
	{
		super(data, columnsNames); //llama al constructor correspondiente de la clase DefualtTableModel
	}
	
	@Override
    public boolean isCellEditable(int row, int col) //metodo para evitar que se edite las celdas de la tabla
    {
        return false;
    }
	
	public void llenarTabla(Empleado[] arrayEmpleados)
	{
		
		try {
	        String datos[] = new String[10];
	        
	        this.setRowCount(0); //vacio la tabla
	        
	        //foreach para recorrer la coleccion de datos de la tabla departamentos de la base de datos empresa
	        for(int i = 0; i < arrayEmpleados.length && arrayEmpleados[i] != null; i++)
	        {
	        	datos[0] = Integer.toString(arrayEmpleados[i].getId());
	        	datos[1] = arrayEmpleados[i].getCodigo();
	        	datos[2] = arrayEmpleados[i].getNombre();
	        	datos[3] = arrayEmpleados[i].getApellido();
	        	datos[4] = Integer.toString(arrayEmpleados[i].getEdad());
	        	datos[5] = arrayEmpleados[i].getTelefono();
	        	datos[6] = Double.toString(arrayEmpleados[i].getSalario_base());
	        	datos[7] = arrayEmpleados[i].getPuesto();
	        	datos[8] = arrayEmpleados[i].getPais();
	        	datos[9] = arrayEmpleados[i].getDepartamento();
	            
	            this.addRow(datos); //se agrega la fila a la tabla
	        }        
      
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
