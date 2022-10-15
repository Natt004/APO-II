import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	Persona per=new Persona();
	Persona persona1=new Persona("", 0, 0, 'H', 0, 0);
	Persona persona2=new Persona("", 0, 'H');
	Persona persona3=new Persona();

	Scanner sc=new Scanner(System.in);
	String sexo="";
	System.out.println("-----Persona 1-----");

	System.out.println("Escriba el nombre: ");
	persona1.setNombre(sc.next());

	System.out.println("Escriba su edad: ");
	persona1.setEdad(sc.nextInt());

	System.out.println("Digite su sexo H:Hombre M:Mujer");
	sexo=sc.next();
	persona1.setSexo(sexo.charAt(0));
	persona1.comprobarSexo();

	System.out.println("Digite su peso en kg: ");
	persona1.setPeso(sc.nextDouble());

	System.out.println("Digite su altura en m: ");
	persona1.setAltura(sc.nextDouble());
	
	persona1.generaDNI();

	System.out.println("-----Persona 2-----");

	System.out.println("Escriba el nombre: ");
	persona2.setNombre(sc.next());

	System.out.println("Escriba su edad: ");
	persona2.setEdad(sc.nextInt());

	System.out.println("Digite su sexo H:Hombre M:Mujer");
	sexo=sc.next();
	persona2.setSexo(sexo.charAt(0));
	persona2.comprobarSexo();
	
	persona2.generaDNI();

	persona3.setNombre("Lucas");
	persona3.setEdad(25);
	persona3.setSexo('H');
	persona3.setPeso(20);
	persona3.setAltura(1.5);
	
	persona3.generaDNI();

	System.out.println("\n"+persona1);
	persona1.esMayordeEdad(persona1.getEdad());
	persona1.CalcularIMC(persona1.getPeso(),persona1.getAltura());
	System.out.println("\n" +persona2);
	persona2.esMayordeEdad(persona2.getEdad());
	persona2.CalcularIMC(persona2.getPeso(),persona2.getAltura());
	System.out.println("\n" +persona3);
	persona3.esMayordeEdad(persona3.getEdad());
	persona3.CalcularIMC(persona3.getPeso(),persona3.getAltura());
	}
	}

