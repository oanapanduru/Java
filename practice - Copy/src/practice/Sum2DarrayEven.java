package practice;

public class Sum2DarrayEven {
	
	public static int sum2DarrayEven(int[][] input) {
		int sum = 0;
		for(int i=0; i<input.length; i= i+2) {
			for(int j = 0; j< input.length; j++) {
				sum = sum + input[i][j];
			}
		}
	
		return sum;
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
		    	for(int j =0; j< table.length; j++) {
		    		System.out.print(table[i][j]+ " ");
		    	}
		    	System.out.println();
		    }
	      System.out.println(sum2DarrayEven(table));
	}
}


