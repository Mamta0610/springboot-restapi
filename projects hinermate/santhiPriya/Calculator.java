package santhiPriya;

public class Calculator {
	
	//method to add two integer
	public int add(int num1, int num2) {
		return num1+ num2;
	}
	
	//method to add three integer (overloaded method)
	public int add(int num1, int num2, int num3) {
		return num1+ num2 + num3;
	}
// method1 & method2 same method name, same datatype, different no of parameter
	
	//method to add three doubles (overloaded method)
	public double add(double num1, double num2, double num3) {
		return num1+ num2 + num3;
	}
	
// method2 & method3 same method name, different datatype, same no of parameter

	public static void main(String args[]) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(67, 89));
		System.out.println(calc.add(67.4, 88.0, 23.4));
		System.out.println(calc.add(56, 67, 45));
	}
}
