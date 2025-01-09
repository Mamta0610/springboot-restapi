package santhiPriya;

public class Circle extends Shape{
	
	public void draw() {
		System.out.println("Drawing Circle shape ");
	}
	
	public void calcArea() {
		int radius = 5;
		System.out.print("Circle Area is :");
		System.out.println(3.14 * radius * radius);
	}
	
}
