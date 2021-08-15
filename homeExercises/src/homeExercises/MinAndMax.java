package homeExercises;

public class MinAndMax {

	// TODO:Given an array of ints arr. Find the minimum from the first half and the
	// maximum from the second half.
	// If arr has an odd number of elements, ignore the element from the middle.
	public static void minAndMax(int[] arr) {
		int middle = 0;
		int stop = 0;
		if (arr.length % 2 == 0) {
			middle = arr.length / 2;
			stop = middle;
		} else {
			stop = arr.length / 2;
			middle = arr.length / 2 + 2;
		}
		System.out.println(middle);
		int min = arr[0];
		for (int i = 0; i < stop; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		int max = 0;
		for (int i = middle; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 9, 8, 7, 6, 1, 40, 3, 4, 0, 7, 20 };
		minAndMax(arr);
	}

}
