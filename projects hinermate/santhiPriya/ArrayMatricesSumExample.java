package santhiPriya;

public class ArrayMatricesSumExample {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{4,5,6},{7,8,9},{1,2,3},{4,8,6}};
		
		if(arr1.length==arr2.length && arr1[0].length == arr2[0].length) {
			int rows = arr1.length;
			int cols = arr2.length;
			
			//resultant array 
			int[][] result = new int[rows][cols];
			
			//sum of correspinding elements
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					result[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
			//display the result 
			System.out.println("Sum of Array ");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}
			else {
				System.out.println("Matrices must have same dimesions ");
			}
	}

}
