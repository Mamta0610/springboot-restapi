package santhiPriya;

public class ArrayLaregestSmallestElement {
	public static void main(String[] args) {
		//array initialization with values;
		int[] number1 = {13,56,78,34,89,56,97,12,45,80,64,72,84,90,30};
		
		int largest = number1[0];
		int smallest = number1[0];
		
		for(int i=1;i<number1.length;i++) {
			if(number1[i]>largest) {
				largest = number1[i]; //update largest
			}else if(number1[i]<smallest) {
				smallest= number1[i];
			}
		}
	System.out.println("Largest Element : " + largest);
		
	System.out.println("Smallest Element : " + smallest);
	}

}
