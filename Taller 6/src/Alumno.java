public class Alumno {

public Alumno(String nombre, String apellido, double nota) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.nota = nota;
	}
private String nombre;
private String apellido;
private double nota;

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

public double getNota() {
	return nota;
}

public void setNota(double nota) {
	this.nota = nota;
}

@Override
public String toString() {
	return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + "]";
}

}
