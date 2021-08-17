package homeExercises;

public class PrintInCustomOrderRows {

	// TODO:Given a matrix a of size n*m. Print the elements in the following order:
	// first row from left to right, second row from right to left, third row from
	// left to right,
	// forth row from right to left, and so on…
	public static void printCustomOrderRows(int [][]a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(" ");
			if(i%2==0) {
				for(int j =0; j<a[0].length; j++) {
					System.out.print(a[i][j]+ " ");
				}
			}
			else {
				for(int j =a[0].length-1; j>=0; j--) {
					System.out.print(a[i][j]+ " ");
				}
			}
			System.out.println();
		}
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
	    printCustomOrderRows(table);
	}

}
