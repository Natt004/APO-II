import java.util.Scanner;

public class Operaciones {
Scanner sc=new Scanner(System.in);

public double[][] IngresarMatrizUno(int filasM, int columnasM)
{	double[][] matrizUno=new double[filasM][columnasM];
	for (int i=0;i<filasM;i++)
{for (int j=0;j<columnasM;j++)
{System.out.println("Ingrese el valor de la matriz uno posicion fila: " +i +" columna:" +j);
matrizUno[i][j]=sc.nextDouble();
}}
System.out.println("\n** La matriz uno es: **");
for (int i=0;i<filasM;i++)
{ 
for (int j=0;j<columnasM;j++)
{
System.out.print("| " +matrizUno[i][j] +" ");}
System.out.println("|");
System.out.println();}
return matrizUno;
}

public double[][] IngresarMatrizDos(int filasM, int columnasM)
{ double[][] matrizDos=new double[filasM][columnasM];

	for (int i=0;i<filasM;i++)
	{for (int j=0;j<columnasM;j++)
	{{System.out.println("Ingrese el valor de la matriz dos posicion fila: " +i +" columna:" +j);
	matrizDos[i][j]=sc.nextDouble();
	}
	}
	}
	System.out.println("\n** La matriz dos es: **");
	for (int i=0;i<filasM;i++)
	{ 
	for (int j=0;j<columnasM;j++)
	{
	System.out.print("| " +matrizDos[i][j] +" ");
	}
	System.out.println("|");
	System.out.println();
	
}
	return matrizDos;}

public void Suma(int filasM, int columnasM, double[][] matrizuno, double[][] matrizdos)
{double[][] resultadoMatrices=new double[filasM][columnasM];
for (int i=0;i<filasM;i++) {
	for (int j=0;j<columnasM;j++)
	{ 
	resultadoMatrices[i][j]=matrizuno[i][j]+matrizdos[i][j];
	}}
	System.out.println("\n** La suma de ambas matrices es: **");
	for (int i=0;i<filasM;i++)
	{ 
	for (int j=0;j<columnasM;j++)
	{
	System.out.print("| " +resultadoMatrices[i][j] +" ");
	}
	System.out.println("|");
	System.out.println();
	}
}

public void Resta(int filasM, int columnasM, double[][] matrizuno, double[][] matrizdos)
{double[][] resultadoMatrices=new double[filasM][columnasM];
for (int i=0;i<filasM;i++)
{for (int j=0;j<columnasM;j++)
{
resultadoMatrices[i][j]=matrizuno[i][j]-matrizdos[i][j];
}
}
System.out.println("\n** La resta de ambas matrices es: **");
for (int i=0;i<filasM;i++)
{ 
for (int j=0;j<columnasM;j++)
{
System.out.print("| " +resultadoMatrices[i][j] +" ");
}
System.out.println("|");
System.out.println();
}	
}

public void Multiplicacion(int filasM, int columnasM, double[][] matrizUno, double[][] matrizDos)
{ double[][] resultadoMatrices=new double[filasM][columnasM];
	for (int i=0;i<filasM;i++)
	{for (int j=0;j<columnasM;j++)
	{for (int h=0;h<columnasM;h++)
	{resultadoMatrices[i][j]+=matrizUno[i][h]*matrizDos[h][j];
	}
	}
	}
	System.out.println("\n** La multiplicacion de ambas matrices es: **");
	for (int i=0;i<filasM;i++)
	{ 
	for (int j=0;j<columnasM;j++)
	{
	System.out.print("| " +resultadoMatrices[i][j] +" ");
	}
	System.out.println("|");
	System.out.println();
	}}}




