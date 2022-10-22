import java.util.LinkedList;
import java.util.List;

public class Videojuego implements Entregable {
	
private String titulo="";
private int horasEstimadas=10;
private boolean entregado=false;
private String genero="";
private String compania="";

public Videojuego() {}

public Videojuego(String titulo, int horasEstimadas) {
	this.titulo = titulo;
	this.horasEstimadas = horasEstimadas;
}
public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
	this.titulo = titulo;
	this.horasEstimadas = horasEstimadas;
	this.genero = genero;
	this.compania = compania;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getHorasEstimadas() {
	return horasEstimadas;
}
public void setHorasEstimadas(int horasEstimadas) {
	this.horasEstimadas = horasEstimadas;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getCompania() {
	return compania;
}
public void setCompania(String compania) {
	this.compania = compania;
}
@Override
public String toString() {
	return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
			+ ", genero=" + genero + ", compania=" + compania + "]";
}

@Override
public void entregar() {
entregado=true;
}

@Override
public void devolver() {
entregado=false;
}

@Override
public boolean isEntregado(Object a) {
Object serie=a;
return entregado;
}

String temp="10";

@Override
public void compareTo(Object a)
{
	{Object horas=a;
	if(horas.toString().compareTo(this.temp)>=0)
	{this.temp=horas.toString();
	}
}}}
