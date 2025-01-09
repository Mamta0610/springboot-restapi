package santhiPriya;

public class ArrayInsertionSortingExample {
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
		
		//shift elements of arr[0,...i-1] that are greater than key.
		//to one position ahead of their current position 
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1]=key;
	}
		}
	
	public static void printArray(int[] arr) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//array initialization with values;
	int[] number1 = {13,56,78,34,89,56,97,12,45,80,64,72,84,97,30};
		
	System.out.println("Before Sorting");
	printArray(number1);
	insertionSort(number1);
	
	System.out.println("After Sorting");
	printArray(number1);
	
	
		}
	}


