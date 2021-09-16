package homeExercises;

public class TransposeMatrix {

//Write a method that takes as input a 2D array and returns a new 2D array which is its transpose.
 public static void transposeMatrix(int[][]matrix) {
	 int[][]result = new int[matrix[0].length][matrix.length];
	 for(int i=0;i<matrix.length; i++) {
		 for(int j=0; j<matrix[0].length;j++) {
			 if(i!=j) {
				 result[j][i]= matrix[i][j];
			 }
			 else if(i==j) {
				 result[i][j]=matrix[i][j];
			 }
		 }
	 }
	 for (int i = 0; i < result.length; i++) {
			for (int j = 0; j <result[0].length; j++) {
				System.out.print(" ");
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("initial matrix");
		int[][] table = new int[3][3];
		table[0][0] = 1;
		table[0][1] = 2;
		table[0][2] = 10;
		table[1][0] = 3;
		table[1][1] = 4;
		table[1][2]= 11;
		table[2][0] = 5;
		table[2][1] = 6;
		table[2][2] = 12;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("transposed matrix");
		transposeMatrix(table);
	}
	

}
