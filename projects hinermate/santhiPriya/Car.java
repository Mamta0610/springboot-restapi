package santhiPriya;

public class Car extends Vehicle{
	
	String carType;
	String fuelType;
	int noOfSeats;

	public Car(int s, int fuelCapacity, String brand, String carType, String fuelType, int noOfSeats) {
		super(s, fuelCapacity, brand);
		this.carType= carType;
		this.fuelType = fuelType;
		this.noOfSeats = noOfSeats;	
	}
	
	public void honk() {
		System.out.println("Car is honking ");
	}
}
