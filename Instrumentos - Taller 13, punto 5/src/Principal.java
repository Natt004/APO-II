import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	


Guitar guitar1= new Guitar(true, 200000, 20,2,true);
Guitar guitar2=new Guitar(false,150000,10,3,false);

Scanner sc=new Scanner(System.in);
System.out.println("||| Bienvenido: |||");
System.out.println("Que guitarra desea comprar?: \n1.Electrica\n2.Normal.");
int eleccion=sc.nextInt();
if (eleccion==1)
{
System.out.println("---Guitarra Electrica---");
System.out.println("Es usted un empleado? \n1.Si\n2.No");
int empleado=sc.nextInt();

if(empleado==1)
{guitar1.applyEmployeeDiscount(true);
}

System.out.println("El valor a pagar es: " +guitar1.price);
}
if (eleccion==2)
{System.out.println("---Guitarra Normal---");
System.out.println("Es usted un empleado? \n1.Si\n2.No");
int empleado=sc.nextInt();
if(empleado==1)
{guitar2.applyEmployeeDiscount(true);
}	
System.out.println("El valor a pagar es: " +guitar2.price);
}

}
}