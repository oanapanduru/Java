package homeExercises;

public class TrianglesOfMatrix {

	public static void printSumOfEachTriangle(int[][] a) {
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i < j && i + j < a[0].length - 1) {
					sum1 = sum1 + a[i][j];
					System.out.print(" ");
					System.out.print(a[i][j]);
				}

				if (i < j && i + j > a.length - 1) {
					sum2 = sum2 + a[i][j];
					System.out.print(" ");
					System.out.print(a[i][j]);
				}

				if (i > j && i + j > a.length - 1) {

					sum3 = sum3 + a[i][j];
					System.out.print(" ");
					System.out.print(a[i][j]);
				}

				if (i > j && i + j < a.length - 1) {
					sum4 = sum4 + a[i][j];
					System.out.print(" ");
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println("sum 1: " + sum1 + " sum 2: " + sum2 + " sum 3: " + sum3 + " sum 4: " + sum4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**initial matrix**");
		int[][] table2 = new int[6][6];
		table2[0][0] = 1;
		table2[0][1] = 2;
		table2[0][2] = 3;
		table2[1][0] = 4;
		table2[1][1] = 5;
		table2[1][2] = 6;
		// table2[1][5] = 7;
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
		printSumOfEachTriangle(table2);
	}

}
