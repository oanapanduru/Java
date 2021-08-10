package homeExercises;

public class HowManyThousands {
	// TODO: Given an integer n. Print how many thousands n has.
	// Example: for 4503 you should print 4; 300 -> 0; 14873 -> 14
	public static int howManyThousands(int number) {
		return number / 1000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(howManyThousands(698765432));
	}

}
