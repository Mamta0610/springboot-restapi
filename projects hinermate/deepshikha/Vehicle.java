package deepshikha;

 class Vehicle {
	
	String brand;
	String color;
	int year; 
	
	public Vehicle(String brand, String color, int year) {
		this.brand = brand;
		this.color = color;
		this.year = year;
	}


	void display() {
		System.out.println("Brand is "+brand +" "+" Color is "
	+color+" "+"year is "+year);
	}

}
 
 //public - within class, within subclass, same package, outside package
 // default - within class, within subclass, same package
 //protected - within class, within subclass, same package using inheritance
 //private - within class 