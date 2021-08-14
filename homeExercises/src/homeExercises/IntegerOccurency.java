package homeExercises;

import java.util.Arrays;
import java.util.HashMap;

public class IntegerOccurency {

	// TODO: Given an array of ints arr. Find the number of occurrences for each of
	// the numbers in the array.

	public static void integerOccurencies(int[] arr) {
		int[] occ = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int k = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == k) {
					count++;
				}
			}
			occ[i] = count;
		}
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(occ));
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int k = arr[i];
			if (!map.containsKey(k)) {
				map.put(k, occ[i]);
			}
		}
		for (int i : map.keySet()) {
			System.out.println(i + " " + map.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 3, 1, 5, 6, 1, 0 };
		integerOccurencies(arr);
	}

}
