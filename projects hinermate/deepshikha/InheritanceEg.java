package deepshikha;

class InheritanceEg {

	public static void main(String[] args) {
		
		Car c = new Car("BMW", "white", 2020, "sportcar", 2, "automatic");
		
		MotorCycle mc = new MotorCycle("BMW", "black", 2024, "anc", 80);	
		
		System.out.println(" ----Car ---- ");
		c.display();
		System.out.println(" ----MotorCycle ---- ");
		mc.display();
		System.out.println(" ---- Electric Car ---- ");
		ElectricCar ec = new ElectricCar("BMW", "red", 2023, "regualr", 4,"automatic", 20);
			ec.display();
	}

}
