package deepshikha;

public class Circle extends Shape{
	
	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	double area() {
		return Math.PI * radius * radius;
		}
	
	void display(String type) {
		System.out.println(type);
	}

}
