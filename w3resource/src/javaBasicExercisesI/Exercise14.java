package javaBasicExercisesI;

public class Exercise14 {

	public static void printFlag() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("* * * * * * ==================================");
			} else if (i % 2 == 1) {
				System.out.println("* * * * *   ==================================");
			}

		}
		for (int i = 0; i <= 6; i++) {
			System.out.println("==============================================");
		}
	}

	public static void printFlagMatrix() {
		//String[][] flagArray = new String[10][10];
		int rows = 10;
		int cols = 15;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(i < 5) {
					if(j < 5) {
						System.out.print("* ");
					} else {
						System.out.print("= ");
					}
				} else {
					System.out.print("= ");
				}
			}
			//System.out.print("=");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printFlag();
		printFlagMatrix();
	}

}
