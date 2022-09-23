import java.util.Scanner;

public class Arreglos {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double alumno[]=new double[10];
int alumMayorCal=0;
for (int i=0;i<10;i++)
{int contadorAlum=(i+1);
System.out.println("Escribe la nota el alumno " +contadorAlum); //Se escribe el número décimal con coma.
alumno[i]=sc.nextDouble();
}
double mayorCal=alumno[0];
for (int i=0;i<10;i++)
{int contadorAlum=(i+1);
if (alumno[i]>mayorCal)
{
alumMayorCal=contadorAlum;
mayorCal=alumno[i];
}
}
System.out.println("El alumno con mayor calificacion fue el "+alumMayorCal +" y fue de: "+mayorCal);
}
}

