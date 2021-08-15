package homeExercises;

public class PrincipalDiagonalMatrix {

	//TODO: Given a matrix a with size m*n with int elements. Print the principal diagonal and the sum of its elements.
	public static void principalDiagonal(int[][]matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int sum = 0;
		for(int i=0;i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(" ");
				if(i==j) {
					System.out.print(matrix[i][j]);
					sum = sum + matrix[i][j];
				}
			}
			System.out.println();
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table = new int[3][3];
	    table[0][0] = 1;
	    table[0][1] = 2;
	    table[0][2] = 3;
	    table[1][0] = 4;
	    table[1][1] = 5;
	    table[1][2] = 6;
	    table[2][0] = 7;
	    table[2][1] = 8;
	    table[2][2] = 9;
	    for(int i=0; i<table.length; i++) {
	    	for(int j =0; j< table[0].length; j++) {
	    		System.out.print(table[i][j]+ " ");
	    	}
	    	System.out.println();
	    }
      principalDiagonal(table);
	}

}
