package deepshikha;

public class Reactangle extends Shape{
	
	double length;
	double width;
	
	public Reactangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	double area() {
		return length * width;
	}
	
	void display(String type) {
		System.out.println(type);
	}
}
