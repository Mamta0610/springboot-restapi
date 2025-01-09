package santhiPriya;

public class PatternExample1 {
	public static void main(String[] args) {
		int rows =6;
		for(int i=0;i<rows;i++) {//outer loops for numbers of rows
			for(int j=rows-i;j>1;j--) { //print spaces before stars
				System.out.print(" "); //print space
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
