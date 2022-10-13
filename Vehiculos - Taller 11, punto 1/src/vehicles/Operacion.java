package vehicles;

import java.util.Scanner;

public class Operacion {
	Vehicle[] vc=new Vehicle[2];
	
	void Operacion() {
	System.out.println("Manufacturador: " +Vehicle.MAKE);

	System.out.println("Numero de vehiculos manufacturados: " +Vehicle.numVehicles);
	for (int i=0;i<2;i++)
	{
	Scanner sc=new Scanner(System.in);
	 System.out.println("\n----------------------------");
    System.out.println("Escriba el modelo del vehiculo numero "+(i+1));
    String modelo=sc.next();
	
   vc[i]=new Vehicle(modelo);
	
System.out.println("El vehiculo es manufacturado por: " +Vehicle.MAKE);

System.out.println("Numero de vehiculos manufacturados: " +Vehicle.numVehicles);

System.out.println("El modelo del coche es: "+vc[i].getModel());

 System.out.println("El numero del chassis es: " +vc[i].getChassisNo());
 
    
	}
    }
}
