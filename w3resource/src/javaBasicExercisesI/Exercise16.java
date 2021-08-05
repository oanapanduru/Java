package javaBasicExercisesI;

public class Exercise16 {

	public static void printFace() {
		String[][] faceArray = new String[4][4];
		for (int i = 0; i < faceArray.length; i++) {
			for (int j = 0; j < faceArray[i].length; j++) {
				if (i == 1) {
					//System.out.print("no");
					if (j != 0 && j != faceArray[i].length - 1) {
						System.out.print(" x");
					}

				}
				System.out.print(" ");
				if (i == faceArray.length - 1) {
					System.out.print("=");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFace();
	}

}
