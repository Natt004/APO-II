import java.util.List;

//Se heredan los metodos y atributos de la clase empleado y se implementa la interface.
public class DesarrolladorBackend extends Empleado implements OperacionEmpleado {

//Se declaran los atributos privados de la clase:
	
//Variables:
private String skill;
private List listaLenguajes;

//Constantes:
private static double AUMENTO_VARIABLE=5;

//Se declaran los constructores de la clase, uno por defecto y el otro con ambos atributos.

public DesarrolladorBackend(String nombre, String apellidos, String direccion, int dni, double salario, char sexo) {
super(nombre, apellidos, direccion, dni, salario, sexo);
}

public DesarrolladorBackend(String nombre, String apellidos, String direccion, int dni, double salario, char sexo,
String skill, List listaLenguajes) {

super(nombre, apellidos, direccion, dni, salario, sexo);
this.skill = skill;
this.listaLenguajes = listaLenguajes;
}

//Se declaran los metodos getters y setters

public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public List getListaLenguajes() {
	return listaLenguajes;
}
public void setListaLenguajes(List listaLenguajes) {
	this.listaLenguajes = listaLenguajes;
}

//Se agregan los metodos abstractos de la interface:

@Override
public double devolverSalario() {

double temp;
temp=SALARIO_MINIMO+AUMENTO_VARIABLE;
temp=temp*(DESCUENTO_EPS+DESCUENTO_FP/100);

return temp;
}

}
