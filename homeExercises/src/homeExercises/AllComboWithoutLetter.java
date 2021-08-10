package homeExercises;

import java.util.ArrayList;

public class AllComboWithoutLetter {

	// TODO: Write a method that has one parameter: String s.
	// Write all possible variants of the String s without each of its letters but
	// replace all of the occurrences of that letter;
	// The printed variants should be unique.
	// Example: for String ‘abacb’ print ‘bcb’, ‘aac’, ‘abab’

	public static void printAllCombroWithoutLetter(String s) {
		ArrayList<String> substrings = new ArrayList<String>();
		for (int i = 0; i < s.length() ; i++) {
			String result = "";
			char c = s.charAt(i);
			System.out.println("c: " + c);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) != c) {
					result += s.charAt(j);
					substrings.add(result);
				}
			}
		}
		for (String sub : substrings) {
			System.out.println(sub + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllCombroWithoutLetter("abacb");
	}

}
