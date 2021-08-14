package homeExercises;

import java.util.Arrays;

public class CharOccurenciescCount {

	// Given an array of chars arr. Find the character with the most occurrences.
	// If more than one character with the most number of occurrences print all of
	// them.
	public static void charOccurencies(char[] arr) {
		int[] occurencies = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			char c = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j]== c) {
					count++;
				}
			}
			occurencies[i] = count;
		}
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(occurencies));

		int max = 0;
		for (int i = 0; i < occurencies.length; i++) {
			if (occurencies[i] > max) {
				max = occurencies[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (occurencies[i] == max) {
				System.out.println(arr[i] + " " + occurencies[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[] { 'a', 'b', 'c', 'a', 'b', 'a', 'a', 'a', 'c', 'd', 'u', 'b', 'b', 'b' };
		charOccurencies(arr);
	}

}
