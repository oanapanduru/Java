package homeExercises;

import java.util.HashMap;

public class CharOccurencies {
	// TODO:Given an array of chars arr. Print for each char in arr how many
	// occurrences it has.
	public static void printCharOccurencies(char[] arr) {
		int[] times = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			char c = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == c) {
					count++;
				}
			}
			times[i] = count;

		}

		HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		for(int i=0;i<arr.length; i++) {
			char c = arr[i];
			if(!map.containsKey(c)) {
				map.put(c, times[i]);
				System.out.println(c + " " + times[i]);
			}
		}

	}
	
	public static void printCharOccurencies2(char[] arr) {
		// ascii code for a - 97 z - 122
		int[] times = new int[26];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			char c = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == c) {
					count++;
				}
			}
			times[c - 97] = count;

		}

		for(int i=0;i<times.length; i++) {
			if(times[i] > 0) {
				char c = (char)(i + 97);
				System.out.println(c + " " + times[i]);
			}
		}

	}
	
	public static void printCharOccurencies3(char[] arr) {
		// ascii code for a - 97 z - 122
		char[] chars = new char[0];
		int[] times = new int[0];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			char c = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == c) {
					count++;
				}
			}
			boolean isAdded = false;
			for(int j = 0; j < chars.length; j++) {
				if(chars[j] == c) {
					isAdded = true;
					break;
				}
			}
			if(!isAdded) {
				char[] auxArr = new char[chars.length + 1];
				for(int j = 0; j < chars.length; j++) {
					auxArr[j] = chars[j];
				}
				auxArr[chars.length] = c;
				chars = auxArr;
				
				int[] auxArr2 = new int[times.length + 1];
				for(int j = 0; j < times.length; j++) {
					auxArr2[j] = times[j];
				}
				auxArr2[times.length] = count;
				times = auxArr2;
			}

		}

		for(int i=0;i<times.length; i++) {
			if(times[i] > 0) {
				char c = (char)(i + 97);
				System.out.println(c + " " + times[i]);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[] { 'a', 'b', 'c', 'a', 'b', 'a', 'a' , 'a', 'c', 'd', 'u'};
		//char[] arr = new char[] { 'a'};
		printCharOccurencies3(arr);
	}

}
