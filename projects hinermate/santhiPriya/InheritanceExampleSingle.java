package santhiPriya;

public class InheritanceExampleSingle {

	public static void main(String[] args) {
		//child object 
		Car v = new Car(60, 400, "Tata", "Manual", "Petrol", 5);
		
	//access to parent property using child object
	System.out.println("Car fuel capacity : " + v.fuelCapacity);
	System.out.println("Car avg speed : " + v.speed);
	System.out.println("Car brand : "+v.brand);

	
	//access to child property with its object
	System.out.println("Car Type : " + v.carType);
    System.out.println("Car fuel type : " + v.fuelType);
    System.out.println("Total seats in Car : " + v.noOfSeats);
	
    //invoke parent method using child object
	v.brake();
	v.accelerate();
	
	//invoke child method with its object
	v.honk();
	}

}
