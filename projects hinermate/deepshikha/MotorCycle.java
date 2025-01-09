package deepshikha;

public class MotorCycle extends Vehicle{
	String engine;
	int speed;
	
	public MotorCycle(String brand, String color, int year, String engine, int speed) {
		super(brand, color, year);
		this.engine = engine;
		this.speed = speed;
	}

	void display() {
		System.out.println("engine " + engine +" "+ " speed " + speed);
		super.display();
	}
	
}
