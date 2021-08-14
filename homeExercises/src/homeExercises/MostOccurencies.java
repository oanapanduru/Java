package homeExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MostOccurencies {
	// TODO:Given an array of chars arr. Find the character with the most
	// occurrences.
	// If more than one character with the most number of occurrences print the
	// first in the alphabet.
	public static void mostOccurencies(char[] arr) {
		int[] occ = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			char c = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == c) {
					count++;
				}
			}
			occ[i] = count;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		// System.out.println(Arrays.toString(arr));
		// System.out.println(Arrays.toString(occ));
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (!map.containsKey(c)) {
				map.put(c, occ[i]);
				// System.out.println(c + " " + occ[i]);
			}
		}
		int max = 0;
		for (char c : map.keySet()) {
			if (map.get(c) > max) {
				max = map.get(c);
			}
		}
		// System.out.println(max);
		ArrayList<Character> arr2 = new ArrayList<Character>();
		for (char c : map.keySet()) {
			if (map.get(c) == max) {
				arr2.add(c);
				// System.out.println(c);
			}
		}
		char ch = 'z';
		for (char c : arr2) {
			if (c < ch) {
				ch = c;
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char[] arr = new char[] { 'a', 'b', 'c', 'a', 'b', 'a', 'a', 'a', 'c', 'd',
		// 'u', 'b', 'b', 'b' };
		char[] arr = new char[] { 'x', 'j', 'u', 'c', 'd', 'c', 'd' };
		mostOccurencies(arr);
	}

}
