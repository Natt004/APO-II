import java.util.Scanner;

public class Informacion {
	double[][] Calificaciones=new double[1][5];
	int contador=0;
	double[][] RecopilarDatos()
	{
	Scanner sc=new Scanner(System.in);
	for (int i=0;i<1;i++)
	{System.out.println("\n|| Estudiante ||");
	contador=0;
	for (int j=0;j<5;j++)
	{contador++;
	System.out.println("Escriba su calificacion en la prueba " +contador +":");
	Calificaciones[i][j]=sc.nextDouble();
	if (Calificaciones[i][j]>100)
	{System.out.println("\n----La calificacion debe estar entre 0 y 100, vuelve a intentarlo----\n");
	contador--;
	j--;
	}}}return Calificaciones;
	}}
