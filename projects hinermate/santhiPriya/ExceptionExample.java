package santhiPriya;

public class ExceptionExample {
	public static void main(String[] args) {
		try {//code which may throw exception
			System.out.println(10/0);
		}catch(ArithmeticException e) { // handle exception raised in try block 
			System.out.println(e);
		}
		finally {
			System.out.println(" Hello ");
			System.out.println(" Greetings from gigame ");
		}
		try { //outer try
			 String name = null;
			 System.out.println(name.length()); 
			 	try { //inner try
			 		String n1="abc";
			 		int num = Integer.parseInt(n1);
			 		System.out.println(num);
			 	}catch(NumberFormatException e) { //inner catch
			 		System.out.println(e);
			 }
		}catch(Exception e) { //handle the exception raised in try block  outer catch
			System.out.println(e);
		}
		
	}

}
