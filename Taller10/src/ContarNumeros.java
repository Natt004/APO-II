import java.util.Scanner;

public class ContarNumeros {

void ContarCantidad()
{
ObtenerNumero Ob=new ObtenerNumero();
Scanner sc=new Scanner(System.in);
System.out.println("Escriba el numero que desea contar");
Ob.setNumero(sc.nextInt());
int num=Ob.getNumero();
int cantidadNumeros=0;;
do
{cantidadNumeros++;
	num=num/10;
}while(num!=0);
System.out.println("El numero contiene: " +cantidadNumeros);
}
}
