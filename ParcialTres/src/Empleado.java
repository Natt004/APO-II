//Clase padre
public class Empleado {

//Se declaran los atributos privados de la clase:
	
//Variables:
private String nombre;
private String apellidos;
private String direccion;
private int dni;
private double salario;
private char sexo;

//Constantes:
protected static double SALARIO_MINIMO=980000;
protected static double DESCUENTO_EPS=4;
protected static double DESCUENTO_FP=4;

//Se declaran los diferentes constructores de la clase:

public Empleado(String nombre, String apellidos, String direccion, int dni, double salario, char sexo) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.direccion = direccion;
	this.dni = dni;
	this.salario = salario;
	this.sexo = sexo;
}


public Empleado(String nombre, String apellidos, String direccion, int dni, double salario) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.direccion = direccion;
	this.dni = dni;
	this.salario = salario;
}


public Empleado(String direccion, int dni, char sexo) {
	this.direccion = direccion;
	this.dni = dni;
	this.sexo = sexo;
}


public Empleado(String nombre, String apellidos, int dni, double salario, char sexo) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dni = dni;
	this.salario = salario;
	this.sexo = sexo;
}


public Empleado() {
	
}

//Se declaran los metodos getters y setters de la clase:

public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellidos() {
	return apellidos;
}


public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public int getDni() {
	return dni;
}


public void setDni(int dni) {
	this.dni = dni;
}


public double getSalario() {
	return salario;
}


public void setSalario(double salario) {
	this.salario = salario;
}


public char getSexo() {
	return sexo;
}


public void setSexo(char sexo) {
	this.sexo = sexo;
}










}
