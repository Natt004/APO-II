import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Principal {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
Date fechaNacimiento=new Date(117,11,2);

Student estudiante1=new Student("Lucas","","Morales",fechaNacimiento,"Ingenieria de sistemas",2022);
estudiante1.generarId();

String[] notasEstudiante=new String[3];
System.out.println("Digite las notas del estudiante " +estudiante1.getName() +":");

for (int i=0;i<3;i++)
{System.out.println("Nota " +(i+1) +":");
notasEstudiante[i]=sc.next();
}
System.out.println("--- Alumno sin cambiar su carrera: ----");
estudiante1.calcularGPA(notasEstudiante);
System.out.println(estudiante1);

System.out.println("\n --- Alumno despues de cambiar su carrera: ---");
estudiante1.cambiarCarrera("Contaduria");
System.out.println(estudiante1);

}
}
