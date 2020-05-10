package BD;

import java.sql.*;
import java.util.*;

//la clase Conexion se encargara de establecer la conexion con la base de datos y de cerrarla

public class Conexion {
	
	//conexio establecera la conexion con la base de datos sql
	private static Connection conexion = null;
	
	public static Connection getConexion()
	{
		if(conexion == null)
		{
			try {
				//el metodo addSgutdownHook cerrara la conexion cuando finalice la ejecucion del programa
				Runtime.getRuntime().addShutdownHook(new CerrarConexion());
				
				//con ResourceBundle accedo al archivo de propiedades ConfigConnection
				ResourceBundle rb = ResourceBundle.getBundle("ConfigConnection");
				
				//obtengo el String de los datos que necesito para la conexion
				String user = rb.getString("user");
				String password = rb.getString("password");
				String url = rb.getString("url");
				String driver= rb.getString("driver");
				
				//establesco el driver
				Class.forName(driver);
				
				//establesco con la conexion
				conexion = DriverManager.getConnection(url, user, password);
				
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		
		return conexion;
	}
	
	
	//CerrarConexion sera la que cierra la conexion con la base de datos del programa
	private static class CerrarConexion extends Thread
	{
		
		@Override
		public void run()
		{ 
			try {
				//se cierra la conexion
				if(conexion != null) { conexion.close(); }
			} catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
}