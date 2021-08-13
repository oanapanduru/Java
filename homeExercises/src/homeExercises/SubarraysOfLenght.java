package homeExercises;

public class SubarraysOfLenght {

	// TODO: Given an array of ints a and an int x. Find and print all subarrays of
	// length x.

	public static void printSubarraysOfLenghtX(int[] a, int x) {
		if (x <= a.length && a.length > 0 && x != 0) {
			for (int i = 0; i <= a.length - x; i++) {
				for (int j = i; j < i + x; j++) {
					System.out.print(a[j]);
				}
				System.out.println();
			}

		} else if (x == 0) {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		} else {
			System.out.println("invalid lengths");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printSubarraysOfLenghtX(arr, 4);
	}

}
