package homeExercises;

public class MultiplcationMatrix {

	//TODO:Given two matrices a and b. Create their multiplication matrix. 
	public static void multiplicationTable(int[][]a, int [][]b) {
		int [][]result = new int[a.length][b[0].length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				result[i][j]= 0;
				for(int k =0; k<b.length; k++) {
					result[i][j]= result[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("*****");
		int[][] b = new int[3][3];
		b[0][0] = 9;
		b[0][1] = 8;
		b[0][2] = 7;
		b[1][0] = 6;
		b[1][1] = 5;
		b[1][2] = 4;
		b[2][0] = 3;
		b[2][1] = 2;
		b[2][2] = 1;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("*****");
		multiplicationTable(a, b);

	}

}
