package homeExercises;

import java.util.HashSet;

public class PrintAllCombinationsString {

	// TODO: Write a method that receives a parameter s, String - that contains only
	// letters in upper or lower case;
	// this method should print all the possible combinations of the letters in the
	// string with at least two letters;
	// you should ignore case and you should print only unique combinations;
	// your method should work if the String s is null or empty;
	public static void printAllComboString(String s) {
		if (s == null) {
			System.out.println(" invalid input");
		} else if (s.length() == 0) {
			System.out.println(" invalid input");
		} else {

			int[] duplicate = new int[s.length()];
			boolean allOne = false;
			HashSet<String> set = new HashSet<String>();
			while (allOne == false) {
				int countOne = 0;
				int remainder = 1;
				int pos = s.length() - 1;
				String result = "";
				while (remainder == 1 && pos >= 0) {
					duplicate[pos] = duplicate[pos] + remainder;
					if (duplicate[pos] > 1) {
						duplicate[pos] = 0;
						pos--;
						countOne++;
					} else {
						remainder = 0;
					}
				}
				if (countOne == s.length()) {
					allOne = true;
				} else {
					for (int i = 0; i < s.length(); i++) {
						if (duplicate[i] == 1) {
							result = result + s.charAt(i);
						}
					}
					set.add(result.toLowerCase());
				}
			}
			for (String letters : set) {
				if (letters.length() >= 2) {
					System.out.println(letters);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllComboString("abcd");
	}

}
