package homeExercises;

public class GreatestSumOfSubarrays {
	// TODO: Given an array of ints a and an int x. Find and print the greatest sum
	// of the subarray
	// of length x and how many subarrays of length x have this sum.
	public static void printGreatestSumOfSubarray(int[] a, int x) {
		if (x <= a.length && a.length > 0 && x != 0) {
			int count = 0;
			for (int i = 0; i <= a.length - x; i++) {
				int sum = 0;
				for (int j = i; j < i + x; j++) {
					sum = sum + a[j];
				}
				count++;
			}
			int[] sums = new int[count];
			for (int i = 0; i <= a.length - x; i++) {
				int sum = 0;
				for (int j = i; j < i + x; j++) {
					sum = sum + a[j];
				}
				sums[i] = sum;
				// System.out.println(sums[i]);
			}
			int max = 0;

			for (int i = 0; i < sums.length; i++) {
				if (sums[i] > max) {
					max = sums[i];
				}
			}
			int times = 0;
			for (int i = 0; i < sums.length; i++) {
				if (max == sums[i]) {
					times++;
				}
			}
			System.out.println("max sum " + max + " is met for " + times + " subarrays");
		}
		else if (x == 0) {
			int max = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] > max) {
					max = a[i];
				}
			}
			System.out.println("max sum " + max + " is met for 1 subarray");
		} 
		else {
			System.out.println("invalid lengths");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr = new int[] { 1, 2, 0, 0, 0, 1, 2, 0, 1 };
		printGreatestSumOfSubarray(arr, 0);
	}

}
