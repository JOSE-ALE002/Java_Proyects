package BD;

import Modelo.*;
import java.sql.*;
import java.util.*;

//la clase EmpleadosDAO contendra metodos para realizar todas operaciones referentes a la tabla empleados
//de la base de datos

public class EmpleadosDAO {
	//atributos
	private Connection conn = null;
	private PreparedStatement pstm;
	private ResultSet rs;
	private String sql;
	Empleado arrayEmpleados[];
	int indice;
	Empleado empleado;
	String buscar;
				
	public EmpleadosDAO() //constructor
	{
		arrayEmpleados = new Empleado[100];
		conn = null;
		pstm = null;
		rs = null;
	}
				
	//metodo que ingresa un nuevo registro a la tabla empleados
	public int nuevoRegistro(String codigo, String nombre, String apellido, int edad, String telefono, 
			double salario_base, String puesto, String pais, String departamento) 
	{
		int resultado = 0;
		
		try {
			//obtengo la conexion
			conn = Conexion.getConexion();
							
			//defino el update
			sql = "INSERT INTO " + DataBase.TEMPLEADOS + "(" + DataBase.TEMPLEADOS_CODIGO + "," 
			+ DataBase.TEMPLEADOS_NOMBRE + "," + DataBase.TEMPLEADOS_APELLIDO + "," 
					+ DataBase.TEMPLEADOS_EDAD + "," + DataBase.TEMPLEADOS_TELEFONO + "," 
					+ DataBase.TEMPLEADOS_SALARIOBASE + "," + DataBase.TEMPLEADOS_PUESTO+ "," 
					+ DataBase.TEMPLEADOS_PAIS + "," + DataBase.TEMPLEADOS_DEPARTAMENTO
			+ ") VALUES(?,?,?,?,?,?,?,?,?)";
							
			//preparo el query
			pstm = conn.prepareStatement(sql);
							
			//ingreso los datos a la tabla
							
			pstm.setString(1, codigo);
			pstm.setString(2, nombre);
			pstm.setString(3, apellido);
			pstm.setInt(4, edad);
			pstm.setString(5, telefono);
			pstm.setDouble(6, salario_base);
			pstm.setString(7, puesto);
			pstm.setString(8, pais);
			pstm.setString(9, departamento);
							
			//ejecuto el query y obtengo el resultado
			resultado = pstm.executeUpdate();
				
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			//cierro todo menos la conexion
							
			try { 
						
				if(pstm != null)  { pstm.close();}
				if(rs != null) { rs.close(); }
								
			} catch (Exception ex) {
				ex.printStackTrace();
			} 
							
		}
				
		return resultado;
	}
			
	//metodo que retorna un arreglo de objetos de tipo Empleado
	public Empleado[] getEmpleados()
	{
					
		try {					
			
			Arrays.fill(arrayEmpleados, null); //vacio el arreglo
			
			//obtengo la conexion
			conn = Conexion.getConexion();
						
			//defino el query
			sql = "SELECT * FROM " + DataBase.TEMPLEADOS;
					
			//preparo el query
			pstm = conn.prepareStatement(sql);
						
			//ejecuto el query y obtengo el resultado
			rs = pstm.executeQuery();
				
			indice = 0;
			
			//con el ciclo while obtengo los registros (filas) de la tabla empleados y los agrega a la lista
			while(rs.next())
			{
				//obtengo los datos del registro actual
				empleado = new Empleado();
						
				empleado.setId(rs.getInt(DataBase.TEMPLEADOS_ID));
				empleado.setCodigo(rs.getString(DataBase.TEMPLEADOS_CODIGO));
				empleado.setNombre(rs.getString(DataBase.TEMPLEADOS_NOMBRE));
				empleado.setApellido(rs.getString(DataBase.TEMPLEADOS_APELLIDO));
				empleado.setEdad(rs.getInt(DataBase.TEMPLEADOS_EDAD));
				empleado.setTelefono(rs.getString(DataBase.TEMPLEADOS_TELEFONO));
				empleado.setSalario_base(rs.getDouble(DataBase.TEMPLEADOS_SALARIOBASE));
				empleado.setPuesto(rs.getString(DataBase.TEMPLEADOS_PUESTO));
				empleado.setPais(rs.getString(DataBase.TEMPLEADOS_PAIS));
				empleado.setDepartamento(rs.getString(DataBase.TEMPLEADOS_DEPARTAMENTO));
							
				//agrego el objeto actual instanciado al array
				arrayEmpleados[indice] = empleado;
				
				//el contador se va incr
				indice++;
			}
							
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
				
			//cierro todo menos la conexion
						
			try { 
					
				if(pstm != null)  { pstm.close();}
				if(rs != null) { rs.close(); }
						
			} catch (Exception ex) {
				ex.printStackTrace();
			} 
						
		}
					
		return arrayEmpleados;
	}
		
	//metodo que busca empleados en base a un criterio, retorna una arreglo de objetos 
	//de tipo Empleado que se ha encontrado
	public Empleado[] buscarRegistros(String criterio, String key)
	{
						
		try {
			
			Arrays.fill(arrayEmpleados, null); //vacio el arreglo
			
			//obtengo la conexion
			conn = Conexion.getConexion();
							
			//defino el query
			sql = "SELECT * FROM " + DataBase.TEMPLEADOS + " WHERE " + criterio + " = ?";
						
			//preparo el query
			pstm = conn.prepareStatement(sql);
							
			pstm.setString(1, key);
			
			//ejecuto el query y obtengo el resultado
			rs = pstm.executeQuery();
							
			indice = 0;
			
			//con el ciclo while obtengo los registros (filas) de la tabla empleados y los agrega a la lista
			while(rs.next())
			{
				//obtengo los datos del registro actual
				empleado = new Empleado();
							
				empleado.setId(rs.getInt(DataBase.TEMPLEADOS_ID));
				empleado.setCodigo(rs.getString(DataBase.TEMPLEADOS_CODIGO));
				empleado.setNombre(rs.getString(DataBase.TEMPLEADOS_NOMBRE));
				empleado.setApellido(rs.getString(DataBase.TEMPLEADOS_APELLIDO));
				empleado.setEdad(rs.getInt(DataBase.TEMPLEADOS_EDAD));
				empleado.setTelefono(rs.getString(DataBase.TEMPLEADOS_TELEFONO));
				empleado.setSalario_base(rs.getDouble(DataBase.TEMPLEADOS_SALARIOBASE));
				empleado.setPuesto(rs.getString(DataBase.TEMPLEADOS_PUESTO));
				empleado.setPais(rs.getString(DataBase.TEMPLEADOS_PAIS));
				empleado.setDepartamento(rs.getString(DataBase.TEMPLEADOS_DEPARTAMENTO));
								
				//agrego el objeto actual instanciado al array
				arrayEmpleados[indice] = empleado;
				
				indice++;
			}
								
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
					
			//cierro todo menos la conexion
							
			try { 
						
				if(pstm != null)  { pstm.close();}
				if(rs != null) { rs.close(); }
							
			} catch (Exception ex) {
				ex.printStackTrace();
			} 
							
		}
						
		return arrayEmpleados;
	}
	
	//metodo que busca un empleado y retorna un arreglo de objetos de tipo Empleado
	public Empleado[] buscarRegistros(int id)
	{
							
		try {
				
			Arrays.fill(arrayEmpleados, null); //vacio el arreglo
			
			//obtengo la conexion
			conn = Conexion.getConexion();
								
				//defino el query
			sql = "SELECT * FROM " + DataBase.TEMPLEADOS + " WHERE " + DataBase.TEMPLEADOS_ID + " = ?";
							
				//preparo el query
			pstm = conn.prepareStatement(sql);
								
			pstm.setInt(1, id);
				
			//ejecuto el query y obtengo el resultado
			rs = pstm.executeQuery();
								
			indice = 0;
				
			//con el ciclo while obtengo los registros (filas) de la tabla empleados y los agrega a la lista
			while(rs.next())
			{
				//obtengo los datos del registro actual
				empleado = new Empleado();
								
				empleado.setId(rs.getInt(DataBase.TEMPLEADOS_ID));
				empleado.setCodigo(rs.getString(DataBase.TEMPLEADOS_CODIGO));
				empleado.setNombre(rs.getString(DataBase.TEMPLEADOS_NOMBRE));
				empleado.setApellido(rs.getString(DataBase.TEMPLEADOS_APELLIDO));
				empleado.setEdad(rs.getInt(DataBase.TEMPLEADOS_EDAD));
				empleado.setTelefono(rs.getString(DataBase.TEMPLEADOS_TELEFONO));
				empleado.setSalario_base(rs.getDouble(DataBase.TEMPLEADOS_SALARIOBASE));
				empleado.setPuesto(rs.getString(DataBase.TEMPLEADOS_PUESTO));
				empleado.setPais(rs.getString(DataBase.TEMPLEADOS_PAIS));
				empleado.setDepartamento(rs.getString(DataBase.TEMPLEADOS_DEPARTAMENTO));
									
				//agrego el objeto actual instanciado al array
				arrayEmpleados[indice] = empleado;		
			}
									
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
						
			//cierro todo menos la conexion
								
			try { 
							
				if(pstm != null)  { pstm.close();}
				if(rs != null) { rs.close(); }
								
			} catch (Exception ex) {
				ex.printStackTrace();
			} 
								
		}
							
		return arrayEmpleados;
	}
	
	//metodo que elimina un registro de la base de datos
	public int eliminarRegistro(int id)
	{	
		int resultado = 0;
					
		try {
			//obtengo la conexion
			conn = Conexion.getConexion();
									
			//defino el update
			sql = "DELETE FROM " + DataBase.TEMPLEADOS + " WHERE " + DataBase.TEMPLEADOS_ID + " = ?";
									
			//preparod el query
			pstm = conn.prepareStatement(sql);
									
			//ingreso el dato
									
			pstm.setInt(1, id);
									
			//ejecuto el query y obtengo el resultado
			resultado = pstm.executeUpdate();
						
					
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			//cierro todo menos la conexion
									
			try { 
								
				if(pstm != null)  { pstm.close();}
				if(rs != null) { rs.close(); }
										
			} catch (Exception ex) {
				ex.printStackTrace();
			} 
									
		}
						
		return resultado;
					
	}
}
