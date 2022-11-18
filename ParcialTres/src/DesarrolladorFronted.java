//Se heredan los metodos y variables de la clase Empleado y se implementa la interface.
public class DesarrolladorFronted extends Empleado implements OperacionEmpleado {

//Variables:
private int aniosExperienciaBootstrap;
private boolean experienciaCloud;

//Constantes:
private static double AUMENTO_VARIABLE=3;

//Se declaran los constructores de la clase:

public DesarrolladorFronted(String nombre, String apellidos, String direccion, int dni, double salario, char sexo) {
	super(nombre, apellidos, direccion, dni, salario, sexo);
}

public DesarrolladorFronted(String nombre, String apellidos, String direccion, int dni, double salario, char sexo,
		int aniosExperienciaBootstrap, boolean experienciaCloud) {
	
	super(nombre, apellidos, direccion, dni, salario, sexo);
	this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
	this.experienciaCloud = experienciaCloud;
}


//Se declaran los metodos getters y setters de la clase: 

public int getAniosExperienciaBootstrap() {
	return aniosExperienciaBootstrap;
}

public void setAniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
	this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
}

public boolean isExperienciaCloud() {
	return experienciaCloud;
}

public void setExperienciaCloud(boolean experienciaCloud) {
	this.experienciaCloud = experienciaCloud;
}

//Se agregan los metodos abstractos de la interface:

//Se calcula el salario del desarrollador Fronted:
@Override
public double devolverSalario() {
	double temp;
temp=SALARIO_MINIMO+AUMENTO_VARIABLE;
temp=temp*(DESCUENTO_EPS+DESCUENTO_FP/100);

return temp;
}

}
