import java.util.Scanner;

public class Operaciones {
Scanner sc=new Scanner (System.in);
Alumno al[]=new Alumno[10];
String nombre="";
String apellido="";
double nota=0;

public void recorrerArreglo()
{for (int i=0;i<10;i++)
{
	System.out.println("Ingrese el nombre del alumno");
	nombre=sc.nextLine();
	
	System.out.println("Ingrese el apellido del alumno");
	apellido=sc.nextLine();
	
	System.out.println("Ingrese la nota del alumno");
	nota=sc.nextDouble();
	
sc.nextLine();
al[i]=new Alumno(nombre,apellido,nota);
System.out.println("\nEl alumno ingresado fue: " +al[i]+"\n");

}

for (int i=0;i<10;i++)
{
System.out.println(al[i]+"\n");
}

int contador=0;
double tem=al[0].getNota();

for (int i=0;i<10;i++)
{
double notaAlumno=al[i].getNota();
if (notaAlumno>tem)
{
tem=notaAlumno;
contador=i;
}
}
System.out.println("\nEl alumno con mayor nota fue: " +al[contador]);
}
}



