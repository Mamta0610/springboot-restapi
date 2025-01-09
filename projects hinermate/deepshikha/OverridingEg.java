package deepshikha;

public class OverridingEg {
	
	public static void main(String[] args) {
		Circle c = new Circle(5.7);
		Reactangle rr = new Reactangle(7.8, 8.8);
		
		c.display("Circle");
		System.out.println(c.area());
		rr.display("Rectangle");
		System.out.println(rr.area());
		
		
	}

}
//overriding - same method name, same datatype, same no of parameters
// using inheritance