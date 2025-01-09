package santhiPriya;

public class ArraySecondLargestSmallestExample {
	public static void main(String[] args) {
		//array initialization with values;
		int[] number1 = {13,56,78,34,89,56,97,12,45,80,64,72,84,97,30};
		
		//initialize largest, second largest, smallest, second smallest
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0;i<number1.length;i++) {
			if(number1[i]>largest) {
				secondLargest = largest;
				largest = number1[i];
			}else if(number1[i]> secondLargest && number1[i] != largest) {
				secondLargest = number1[i];
			}
		if(number1[i]<smallest) {
			secondSmallest= smallest;
			smallest = number1[i];
		}
		else if(number1[i]<secondSmallest && number1[i] != smallest) {
			secondSmallest = number1[i];
		}
	}
		if(secondLargest != Integer.MIN_VALUE && secondSmallest != Integer.MAX_VALUE) {
			System.out.println("Second Largest Element : " + secondLargest);
			
			System.out.println("Second Smallest Element : " + secondSmallest);
		}else {
			System.out.println("Array does not have proper value");
		}
  }

}
