package vehicles;

import java.util.Scanner;

public class Operacion {
Vehicle[] vc=new Vehicle[2];
		
//Se la asignan valores a la variable de instancia model
void Operacion() {
	
System.out.println("Manufacturador: " +Vehicle.MAKE);

System.out.println("Numero de vehiculos manufacturados: " +Vehicle.numVehicles);
	
System.out.println("\n----------------------------");
   
String modelo1="Vision";
	
vc[0]=new Vehicle(modelo1);
	
//Se muestra en pantalla los datos de la manufactura.
   
System.out.println("El vehiculo es manufacturado por: " +Vehicle.MAKE);

System.out.println("Numero de vehiculos manufacturados: " +Vehicle.numVehicles);

System.out.println("El modelo del coche es: "+vc[0].getModel());

System.out.println("El numero del chassis es: " +vc[0].getChassisNo());

System.out.println("\n----------------------------");
 
String modelo2="Edict";
	
vc[1]=new Vehicle(modelo2);

System.out.println("El vehiculo es manufacturado por: " +Vehicle.MAKE);

System.out.println("Numero de vehiculos manufacturados: " +Vehicle.numVehicles);

System.out.println("El modelo del coche es: "+vc[1].getModel());

System.out.println("El numero del chassis es: " +vc[1].getChassisNo());
}
}
