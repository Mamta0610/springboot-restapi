package santhiPriya;

public class ArrayExample {
	public static void main(String[] args) {
		System.out.println("hi");
		//declare & initializing array
		int[] numbers = new int[5]; //length is 5
		
		//assigning values to array
		numbers[0] = 124;
		numbers[1] = 168;
		numbers[2] = 234;
		numbers[3] = 7676;
		numbers[4] = 1334;
		//numbers[5] = 334;
		
		//printing the elements of array using for loop
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		//printing the element of array using index 
		System.out.println(numbers[3]);
	
	
	//array initialization with values;
	int[] number1 = {13,56,78,34,89,56,97,12,45,80,64,72,84,97,30};
	
	//printing the elements of array using foreach loop
	for(int numm : number1) {
		System.out.print(numm + " ");
	}
}
}