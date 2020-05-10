package BD;

import java.util.*;

/*clase que contiene variables constantes que contiene la informacion referente a la base de datos
 tales como nombre de las tablas y nombre de los campos*  */
public class DataBase {
	
	//clases dao para manejar las tablas de la base de  datos
	public static EmpleadosDAO empleadosDAO = new EmpleadosDAO();
        
	//datos de la tabla Registros
    public static final String TEMPLEADOS = "empleados";
    public static final String TEMPLEADOS_ID = "id";
	public static final String TEMPLEADOS_CODIGO = "codigo";
	public static final String TEMPLEADOS_NOMBRE = "nombre";
	public static final String TEMPLEADOS_APELLIDO = "apellido";
	public static final String TEMPLEADOS_EDAD = "edad";
	public static final String TEMPLEADOS_TELEFONO = "telefono";
	public static final String TEMPLEADOS_SALARIOBASE = "salario_base";
	public static final String TEMPLEADOS_PUESTO = "puesto";
	public static final String TEMPLEADOS_PAIS = "pais";
	public static final String TEMPLEADOS_DEPARTAMENTO = "departamento";
}
