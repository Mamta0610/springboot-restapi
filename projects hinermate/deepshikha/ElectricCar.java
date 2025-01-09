package deepshikha;

 class ElectricCar extends Car{
	
	int batterylife;

	public ElectricCar(String brand, String color, int year, String type, int noOfDoors, String vehicleType,
			int batterylife) {
		super(brand, color, year, type, noOfDoors, vehicleType);
		this.batterylife = batterylife;
	}
	
	void display() {
		System.out.println("batterylife " + batterylife);
		super.display();
	}
	
}
