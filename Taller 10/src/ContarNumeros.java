	import java.util.Scanner;
public class ContarNumeros {

	void ContarCantidad()
	{
	ObtenerNumero Ob=new ObtenerNumero();
	Scanner sc=new Scanner(System.in);
	int continuar;
	do
	{System.out.println("\nEscriba el numero que desea contar");
	Ob.setNumero(sc.nextInt());
	int num=Ob.getNumero();
	int cantidadNumeros=0;;
	do
	{cantidadNumeros++;
		num=num/10;
	}while(num!=0);
	System.out.println("El numero contiene: " +cantidadNumeros +" numeros");
System.out.println("Desea continuar? 0=No, 1=Si");
continuar=sc.nextInt();
	}while(continuar!=0);
	}}
	

