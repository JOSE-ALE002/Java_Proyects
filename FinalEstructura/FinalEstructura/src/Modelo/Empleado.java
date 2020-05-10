package Modelo;

//la clase Empleado abstraera los registros de la tabla empleados de la base de datos

public class Empleado {
	//atributos de la clase
	private int id;
	private String codigo;
	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	private double salario_base;
	private String puesto;
	private String pais;
	private String departamento;
	
	public Empleado() //constructor
	{
		
	}
	
	public Empleado(int id, String codigo, String nombre, String apellido, int edad, String telefono, 
			double salario_base, String puesto, String pais, String departamento) //sobrecargar del constructor de la clase
	{
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.salario_base = salario_base;
		this.puesto = puesto;
		this.pais = pais;
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", código=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad="
				+ edad + ", teléfono=" + telefono + ", salario_base=" + salario_base + ", puesto=" + puesto + ", país="
				+ pais + ", departamento=" + departamento + "]";
	}

	//metodos get y set de los atributos
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public double getSalario_base() {
		return salario_base;
	}
	
	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
