package vehicles;

public class Vehicle {
	//variables estaticas:
	public static String Make="Augur";
	public static int numVehicles=0;

	//variables de instancia:
	private String ChassisNo;
	private String model;

	//Constructor

	public Vehicle(String model) {
	numVehicles++;
	ChassisNo="ch"+numVehicles;
	this.model = model;
	this.ChassisNo=ChassisNo;
	System.out.println("Vehiculo manufacturado\n");
	}


	public String getChassisNo() {
	return ChassisNo;
	}


	public void setChassisNo(String chassisNo) {
	ChassisNo = chassisNo;
	}


	public String getModel() {
	return model;
	}


	public void setModel(String model) {
	this.model = model;

	}

	@Override
	public String toString() {
	return "Vehicle [Chassis=" + ChassisNo + ", Modelo=" + model + "]";
	}}