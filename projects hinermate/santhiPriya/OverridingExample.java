package santhiPriya;

public class OverridingExample {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.calcArea();
		
		Triangle t = new Triangle();
		t.draw();
		t.calcArea();
		
		Rectangle r = new Rectangle();
		r.draw();
		r.calcArea();

	}

}
