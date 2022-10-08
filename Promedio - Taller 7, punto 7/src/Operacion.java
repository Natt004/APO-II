	import java.util.Scanner;
public class Operacion {


	Scanner sc=new Scanner(System.in);
	int contador=0;
	double[] promedio=new double[5];
	double[] sumaCal=new double[5];
	
void CalcularPromedio(double[][] calificaciones)
{
	for (int i=0;i<1;i++)
	{for (int j=0;j<5;j++)
	{ sumaCal[i]+=calificaciones[i][j];
	}
	}
	for (int i=0;i<1;i++)
	{promedio[i]=sumaCal[i]/5;
	System.out.println("\nSu promedio en las pruebas es de: " +promedio[i]);
	}}}



