package santhiPriya;

public class PatternExample {
	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++) { //outer loop for rows
			for(int j=1;j<=i;j++) { //inner loop for cols
				System.out.print("*"); //print star
			}
			System.out.println(); //move to next line after each row
		}
		
	}

}
