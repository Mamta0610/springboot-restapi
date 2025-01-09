package santhiPriya;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingExample {
	public static void main(String[] args) {
		//array initialization with values;
		Integer[] number1 = {13,56,78,34,89,56,97,12,45,80,64,72,84,97,30};
		
		//printing the elements of unsorted array 
		for(int numm : number1) {
			System.out.print(numm + " ");
		}
		System.out.println();
		Arrays.sort(number1);
		
		//printing the elements of sorted array in asc order
				for(int numm : number1) {
					System.out.print(numm + " ");
				}
				System.out.println();
				Arrays.sort(number1, Collections.reverseOrder());
				
				//printing the elements of sorted array in desc order
						for(int numm : number1) {
							System.out.print(numm + " ");
						}
	}

}
