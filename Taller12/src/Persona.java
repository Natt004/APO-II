import java.util.Random;

public class Persona {
	
private String nombre="";
private int edad=0;
private int dni;
private char sexo='H';
private double peso=0;
private double altura=0;



public Persona() { }

public Persona(String nombre, int edad, char sexo) {

this.nombre = nombre;
this.edad = edad;
this.sexo = sexo;
}

public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura) {
		
this.nombre = nombre;
this.dni =dni;
this.edad = edad;
this.sexo = sexo;
this.peso = peso;
this.altura = altura;
}

public int CalcularIMC(double peso,double altura)
{
double pesoIdeal=peso/(Math.pow(altura,2));
if(pesoIdeal>=20&&pesoIdeal<=25)
{System.out.println("Esta en su peso ideal");
return 0;}

else if(pesoIdeal<20)
{System.out.println("Esta bajo de peso");
return -1;
}
else if (pesoIdeal>25)
{System.out.println("Tiene sobrepeso");
return 1;
}
return 0;
}

public boolean esMayordeEdad(int edad)
{ if(edad>18)
{System.out.println("Es mayor de edad");
return true;}
else if (edad<18)
{System.out.println("Es menor de edad");
return false;}

return false;
}

public void comprobarSexo()
{if (sexo!='H'&&sexo!='M')
{sexo='H';
}
}

@Override
public String toString() {
return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + dni + ", sexo=" + sexo + ", peso=" + peso
+ ", altura=" + altura + "]";
	}

	public void generaDNI(){
	Random r=new Random();
	this.dni=r.nextInt(99999999)+1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


	}

