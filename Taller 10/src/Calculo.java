	import java.util.Scanner;
public class Calculo {


	private Datos datos=new Datos();
	Datos dt=new Datos();

	public void CalculoAneo()
	{ Scanner sc=new Scanner(System.in);
	System.out.println("Ingrese el año");
	datos.setAneo(sc.nextInt());

	int anio=datos.getAneo();
	if (anio%4==0&&anio%100!=0||anio%400==0)
	{ 
	System.out.println(anio +" es un año bisiesto");
	}
	else 
	{
	System.out.println(anio +" no es un año bisiesto");
	}
	}
	}


