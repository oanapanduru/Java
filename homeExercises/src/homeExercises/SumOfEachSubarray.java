package homeExercises;

public class SumOfEachSubarray {

	// TODO: Given an array of ints a and an int x. Find and print the sums of each
	// subarray of length x.
	
	public static void printSumOfEachSubarray(int[] a, int x) {
		if (x <= a.length && a.length > 0 && x != 0) {
			for (int i = 0; i <= a.length - x; i++) {
				int sum = 0;
				for (int j = i; j < i + x; j++) {
					sum = sum + a[j];

				}
				System.out.print(sum);
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
		printSumOfEachSubarray(arr, 5);
	}

}
