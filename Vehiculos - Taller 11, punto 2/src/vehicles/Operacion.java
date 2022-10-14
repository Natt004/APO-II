package vehicles;

public class Operacion {
Vehicle[] vc=new Vehicle[2];

//Se le asignan valores a la variable de instancia model
void Operacion() {
	
this.vc[0].Make="Seer";

System.out.println("Manufacturador: " +Vehicle.Make);

System.out.println("Numero de vehiculos manufacturados: " +Vehicle.numVehicles);
			
System.out.println("\n----------------------------");
		   
String modelo1="Vision";
			
vc[0]=new Vehicle(modelo1);
			
//Se muestra en pantalla los datos de la manufactura 1.
		   
System.out.println("El vehiculo es manufacturado por: " +Vehicle.Make);

System.out.println("Numero de vehiculos manufacturados: " +Vehicle.numVehicles);

System.out.println("El modelo del coche es: "+vc[0].getModel());

System.out.println("El numero del chassis es: " +vc[0].getChassisNo());

System.out.println("\n"+vc[0]);

System.out.println("\n----------------------------");
		 
String modelo2="Edict";
			
vc[1]=new Vehicle(modelo2);

//Se muestra en pantalla los datos de la manufactura 2.
		
System.out.println("El vehiculo es manufacturado por: " +Vehicle.Make);

System.out.println("Numero de vehiculos manufacturados: " +Vehicle.numVehicles);

System.out.println("El modelo del coche es: "+vc[1].getModel());

System.out.println("El numero del chassis es: " +vc[1].getChassisNo());

System.out.println("\n"+vc[1]);
		
}}

