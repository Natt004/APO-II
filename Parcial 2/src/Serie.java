
public class Serie implements Entregable {
	
private String titulo="";
private int numeroTemporadas=3;
private boolean entregado=false;
private String genero="";
private String creador="";


public Serie() {
}

public Serie(String titulo, String creador) {
	this.titulo = titulo;
	this.creador = creador;
}
public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
	this.titulo = titulo;
	this.numeroTemporadas = numeroTemporadas;
	this.genero = genero;
	this.creador = creador;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public int getNumeroTemporadas() {
	return numeroTemporadas;
}

public void setNumeroTemporadas(int numeroTemporadas) {
	this.numeroTemporadas = numeroTemporadas;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public String getCreador() {
	return creador;
}

public void setCreador(String creador) {
	this.creador = creador;
}

@Override
public String toString() {
	return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
			+ ", genero=" + genero + ", creador=" + creador + "]";
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

String temp="3";
int contador=0;

@Override
public void compareTo(Object a) 
{Object temporadas=a;
if(temporadas.toString().compareTo(temp)>=0)
{temp=temporadas.toString();
}
}}
