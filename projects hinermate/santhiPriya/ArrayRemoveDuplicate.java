package santhiPriya;

public class ArrayRemoveDuplicate {
	public static void main(String[] args) {
		//array initialization with values;
	int[] number1 = {13,56,78,34,89,56,97,12,45,80,64,72,84,97,30};
	
	//length of array
	int n = number1.length;
	
	//traverse the array to find duplicate
	int newLen = n;
	//initialize newLength of array 
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<newLen;j++) {
				if(number1[i]==number1[j]) {
					//shift all elements after j to the left by one position
					for(int k=j;k<newLen-1;k++) {
						number1[k]= number1[k+1];
					}
					newLen--; //reduce the length of the array
					j--; //recheck current position since its changed
				}
			}
		}
		//print modified array
		System.out.println("Array without duplicate ");
		for(int i=0;i<newLen;i++) {
			System.out.print(number1[i] + " ");
		}
	}
}
