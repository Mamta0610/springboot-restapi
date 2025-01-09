package deepshikha;

public class Car extends Vehicle{
	String type;
	int noOfDoors;
	String vehicleType;
	
	public Car(String brand, String color, int year, String type, int noOfDoors, String vehicleType) {
		super(brand, color, year);
		this.type = type;
		this.noOfDoors = noOfDoors;
		this.vehicleType = vehicleType;
	}


	void display() {
		System.out.println("type "+type+" "+"noOfDoors "+noOfDoors+" "+"vehicleType "+vehicleType);
		super.display(); //call to parent method
	}

}
