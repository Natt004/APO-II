import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
Persona per=new Persona();
Persona persona1=new Persona("", 0, 0, 'H', 0, 0);
Persona persona2=new Persona("", 0, 'H');
Persona persona3=new Persona();
int IMC;

Scanner sc=new Scanner(System.in);
String sexo="";
System.out.println("-----Persona 1-----");

System.out.println("Escriba el nombre: ");
persona1.setNombre(sc.next());

System.out.println("Escriba su edad: ");
persona1.setEdad(sc.nextInt());
persona1.esMayordeEdad();

System.out.println("Digite su sexo H:Hombre M:Mujer");
sexo=sc.next();
persona1.setSexo(sexo.charAt(0));
persona1.comprobarSexo();

System.out.println("Digite su peso: ");
persona1.setPeso(sc.nextDouble());

persona1.CalcularIMC(persona1.getAltura());

System.out.println("Digite su altura: ");
persona1.setAltura(sc.nextDouble());

System.out.println("-----Persona 2-----");

System.out.println("Escriba el nombre: ");
persona2.setNombre(sc.next());

System.out.println("Escriba su edad: ");
persona2.setEdad(sc.nextInt());
persona2.esMayordeEdad();

System.out.println("Digite su sexo H:Hombre M:Mujer");
sexo=sc.next();
persona2.setSexo(sexo.charAt(0));
persona2.comprobarSexo();

persona3.setNombre("Lucas");
persona3.setEdad(25);
persona3.esMayordeEdad();
persona3.setSexo('H');
persona3.setPeso(55);
persona3.CalcularIMC(persona3.getAltura());
persona3.setAltura(1.65);

System.out.println("\n"+persona1);
System.out.println("\n" +persona2);
System.out.println("\n" +persona3);
}
}


