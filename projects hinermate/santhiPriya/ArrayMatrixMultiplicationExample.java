package santhiPriya;

public class ArrayMatrixMultiplicationExample {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{4,5,6},{7,8,9},{1,2,3}};
		
		//check if multiplication is possible (number of columns in matrix1)==(number of rows in matrix2)
		if(arr1[0].length == arr2.length) {
			int rows1 = arr1.length;
			int cols1 = arr1[0].length;
			int cols2 = arr2[0].length;
			
			//initialize the resultant matrix
			int[][] result = new int[rows1][cols2];
			
			//multiply matrices
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols2;j++) {
					for(int k=0;k<cols1;k++) {
						result[i][j] += arr1[i][k] * arr2[k][j];
					}
				}
			}
			//display the result 
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols2;j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Matrix multiplication not possible. ");
		}
	}

}
