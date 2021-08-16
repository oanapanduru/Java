package homeExercises;

public class MinMaxMatrix {
	// TODO: Given a matrix a with size m*n with int elements.
	// Find the minimum from the principal diagonal and the maximum from the
	// secondary diagonal.
	public static void minMaxMatrix(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int min = matrix[0][0];
		int max = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][i] < min) {
					min = matrix[i][i];
				}
				if (matrix[i][n - i - 1] > max) {
					max = matrix[i][n - i - 1];
				}
			}
		}
		System.out.println("min:" + min + "   max:" + max);
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
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		minMaxMatrix(table);

	}

}
