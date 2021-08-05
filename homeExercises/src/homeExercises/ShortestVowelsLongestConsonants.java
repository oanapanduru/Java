package homeExercises;

import java.util.ArrayList;

public class ShortestVowelsLongestConsonants {

	// TODO: Write a method that receives one parameter s, String - that contains
	// only letters in upper or lower case.
	// The method should find the shortest fragment from the string that contains
	// only vowels and the longest fragment
	// from the string that contains only consonants;your method should work if the
	// String s is null or empty;

	public static void vowelsCons(String s) {
		if (s == null) {
			System.out.println("invalid input");
		} else if (s.isEmpty()) {
			System.out.println("invalid input");
		} else {

			ArrayList<String> fragments = new ArrayList<String>();
			// boolean vowel = true;
			// boolean cons = true;
			ArrayList<String> vowels = new ArrayList<String>();
			ArrayList<String> consonants = new ArrayList<String>();
			for (int i = 0; i < s.length(); i++) {
				for (int j = i + 1; j <= s.length(); j++) {
					if (s.substring(i, j).length() >= 2) {
						fragments.add(s.substring(i, j));
					}
				}
			}
			for (String fragment : fragments) {
				boolean vowel = true;
				boolean cons = true;
				for (int i = 0; i < fragment.length(); i++) {
					if (!isVowel(fragment.charAt(i))) {
						vowel = false;
						break;
					}
				}
				if (vowel) {
					vowels.add(fragment);
					// System.out.println(fragment);
				}
				for (int i = 0; i < fragment.length(); i++) {
					if (isVowel(fragment.charAt(i))) {
						cons = false;
						break;
					}
				}
				if (cons) {
					consonants.add(fragment);
					// System.out.println(fragment);
				}
			}

			int minVow = s.length();
			int maxCons = 0;
			int idxV = 0;
			int indxC = 0;
			for (int i = 0; i < vowels.size(); i++) {
				if(vowels.size()>0) {
				if (vowels.get(i).length() < minVow) {
					// System.out.println(minVow);
					minVow = vowels.get(i).length();
					idxV = i;
					// System.out.println(idxV + " " + vowels.get(i));
				}
				}
				
			}
			if(vowels.size()>0) {
			System.out.println("smallest vowels fragment: " + vowels.get(idxV));
			}
			else {
				System.out.println("no vowels");
			}
			for (int i = 0; i < consonants.size(); i++) {
				if(consonants.size()>0) {
				if (maxCons < consonants.get(i).length()) {
					// System.out.println(minVow);
					maxCons = consonants.get(i).length();
					indxC = i;
					// System.out.println(idxV + " " + vowels.get(i));
				}
				}
			}
			if(consonants.size()>0) {
			System.out.println("longest consonants fragment: " + consonants.get(indxC));
			}
			else {
				System.out.println("no consonants");
			}
		}
	}

	public static boolean isVowel(char c) {
		if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i'
				|| Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowelsCons("aaabbbbbdcaaaeeeaaahhhhhhhhhhhhhhhhhhhhhhhh");
		// System.out.println(isVowel('c'));
	}

}
