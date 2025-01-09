package santhiPriya;

public class FirstExample {
	//default method
	void add() {
		int num1=500;       //local variable
		double num2=67.908;
		System.out.println("local variable  " + (num1+num2)); //print result
	}
	long phone = 987654321; //reference variable
	
	static String address = "XYZ Street, New York"; //static variable
	
	//entry point
	public static void main(String[] args) {
		System.out.println("Hello , how are you  ??? ");
		//object creation
		FirstExample obj = new FirstExample();
		
		//call an function/method with object
		obj.add(); //objectname.methodname()
		
		//call an reference variable with object
		System.out.println("reference variable  " + obj.phone); //objectname.propertyname
		
		System.out.println("static variable  " + FirstExample.address); //classname.propertyname
	}

}
