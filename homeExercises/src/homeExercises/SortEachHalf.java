package homeExercises;

import java.util.Arrays;

public class SortEachHalf {

	// TODO:Given an array of ints arr.Sort the first half in ascending order and
	// the second half in descending order.
	// If arr has an odd number of elements put the element from the middle in the
	// second half.
	public static void sortEachHalf(int[] arr) {
		int half = 0;
		System.out.println(Arrays.toString(arr));
		if (arr.length % 2 == 0) {
			half = arr.length / 2;
			//System.out.println(half);
		}

		else {
			half = arr.length / 2 + 1;
			//System.out.println(half);
		}
		for (int i = 0; i < half - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < half; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = half; i < arr.length - 1; i++) {
			int maxIdx = i;
			for (int j = i + 1; j <arr.length; j++) {
				if (arr[j] > arr[maxIdx]) {
					maxIdx = j;
				}
			}
			int temp = arr[maxIdx];
			arr[maxIdx] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 9, 8, 7, 6, 1, 2, 3, 4,0,7,8 };
		sortEachHalf(arr);
	}

}
