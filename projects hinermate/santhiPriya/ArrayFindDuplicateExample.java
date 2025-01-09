package santhiPriya;

public class ArrayFindDuplicateExample {
	public static void main(String[] args) {
		//array initialization with values;
		int[] number1 = {13,56,78,34,89,56,97,12,45,80,64,72,84,97,30};
		
		//to check if duplicate exists
		boolean foundDuplicate = false;
		
		//traverse array 
		for(int i=0;i<number1.length;i++) {
			//compare the current element with rest of elements
			for(int j=i+1;j<number1.length;j++) {
				if(number1[i]==number1[j]) {
					//print duplicate & mark as true
					System.out.println("Duplicate element " + number1[i]);
					foundDuplicate = true;
					break;
					//to avoid printing same duplicate element multiple times
				}
			}
		}
		if(!foundDuplicate) {
			System.out.println("No Duplicate found ");
		}
	}
}
