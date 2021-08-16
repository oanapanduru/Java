package homeExercises;

public class Matrix {
	// TODO: Given a matrix a with size m*n with int elements:
	// a) Print the sum of the elements under the principal diagonal including the
	// elements on the principal diagonal.

	public static void elementsUnderPrincipalDiagonal(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}

	// TODO:
	// b)Print the sum of the elements above the principal diagonal excluding the
	// elements of the principal diagonal
	public static void printElementsAbovePrincipalDiagonal(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(" ");
			for (int j = i + 1; j < a[0].length; j++) {
				System.out.print(" ");
				System.out.print(a[i][j]);

			}
			System.out.println();
		}
	}

	// c)Print the sum of the elements under the secondary diagonal including the
	// elements on the secondary diagonal.

	public static void printElementsUnderSecondaryDiagonal(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = a[0].length - i - 1; j < a[0].length; j++) {
				System.out.print(" ");
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	// d)Print the sum of the elements above the secondary diagonal excluding the
	// elements of the secondary diagonal
	public static void printSumElementsAboveSecondaryDiagonal(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = a[0].length - i; j < a[0].length; j++) {
				System.out.print(" ");
				System.out.print(a[i][j]);
				sum = sum + a[i][j];
			}
			System.out.println();
		}
		System.out.println("sum: " + sum);
	}

	// e)Print the sum of each of the four triangles found between the principal and
	// secondary diagonals
	public static void printSumTrianglesBetweenDiagonals(int[][] a) {
		int sumAboveDiag = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a[0].length - i - 1; j++) {
				System.out.print(" ");
				System.out.print(a[i][j]);
				sumAboveDiag = sumAboveDiag + a[i][j];
			}
		}
		System.out.println();
		System.out.println("sum of the elements above the diagonals: " + sumAboveDiag);

		int sumLeftDiag = 0;
		for (int i = 0; i < a[0].length; i++) {
			for (int j = i + 1; j < a.length - i - 1; j++) {

				System.out.print(" ");
				System.out.print(a[j][i]);
				sumLeftDiag = sumLeftDiag + a[j][i];

			}
		}
		System.out.println();
		System.out.println("sum of the elements left to the diagonals: " + sumLeftDiag);

		int sumRightDiag = 0;
		for (int i = 0; i < a[0].length; i++) {
			for (int j = a.length - i; j < i; j++) {
				// if (j > i + 1) {
				System.out.print(" ");
				System.out.print(a[j][i]);
				sumRightDiag = sumRightDiag + a[j][i];
				// }
			}
		}
		System.out.println();
		System.out.println("sum of the elements right to the diagonals: " + sumRightDiag);

		int sumBelowDiag = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = a[0].length - i; j < i; j++) {
				System.out.print(" ");
				System.out.print(a[i][j]);
				sumBelowDiag = sumBelowDiag + a[i][j];
			}
		}
		System.out.println();
		System.out.println("sum of the elements below to the diagonals: " + sumBelowDiag);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**initial matrix**");
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
		System.out.println("**after method calls**");
		elementsUnderPrincipalDiagonal(table);
		System.out.println();
		printElementsAbovePrincipalDiagonal(table);
		System.out.println();
		printElementsUnderSecondaryDiagonal(table);
		System.out.println();
		printSumElementsAboveSecondaryDiagonal(table);
		System.out.println();
		System.out.println("**initial matrix**");
		int[][] table2 = new int[6][6];
		table2[0][0] = 1;
		table2[0][1] = 2;
		table2[0][2] = 3;
		table2[1][0] = 4;
		table2[1][1] = 5;
		table2[1][2] = 6;
		table2[2][0] = 7;
		table2[2][1] = 8;
		table2[2][2] = 9;
		table2[3][4] = 3;
		table2[3][5] = 2;
		table2[2][5] = 7;
		table2[4][2] = 1;
		table2[4][3] = 1;
		table2[5][1] = 2;
		table2[5][2] = 3;
		table2[5][3] = 4;
		table2[5][4] = 5;
		for (int i = 0; i < table2.length; i++) {
			for (int j = 0; j < table2[0].length; j++) {
				System.out.print(table2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		printSumTrianglesBetweenDiagonals(table2);
	}

}
