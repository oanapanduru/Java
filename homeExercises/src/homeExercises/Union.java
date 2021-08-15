package homeExercises;

import java.util.Arrays;

public class Union {

	// TODO:Given two arrays of ints a and b. Print the union of the arrays.
	public static void union(int[] first, int[] second) {
		int count = 0;
		for (int i = 0; i < second.length; i++) {
			boolean diff = false;
			for (int j = 0; j < first.length; j++) {
				if (first[j] == second[i]) {
					diff = true;
				}
			}
			if (!diff) {
				count++;
			}
		}
		int[] result = new int[first.length + count];
		for (int i = 0; i < first.length; i++) {
			result[i] = first[i];
		}
		int idx = first.length;
		for (int i = 0; i < second.length; i++) {
			boolean flag = false;
			for (int j = 0; j < first.length; j++) {
				if (second[i] == first[j]) {
					flag = true;
				}

			}
			if (!flag) {
				result[idx] = second[i];
				idx++;
			}
		}
		// System.out.println(count);
		System.out.println(Arrays.toString(result));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int[] second = new int[] { 3, 4, 8, 10, 11 };
		union(first, second);
	}

}
