package homeExercises;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintAllCombinations {

	// TODO: Write a method that receives a parameter a, array a of type char -
	// lower or upper case;
	// this method should print all the possible combinations of the letters in the
	// array with at least two letters;
	// you should ignore case and you should print only unique combinations;
	// your method should work if the array a is empty;
	// Ex: a = { a, b, c, d }
	// Output: ab, ac, ad, bc, bd, cd, abc, abd, acd, bcd, abcd
	// Tips:
	// First make your method to print all the combinations;
	// After that you should store the combinations in order to see if a combination
	// was already found and ignore if it was found;
	// After that you should ignore case;

	public static void printAllCombo(char[] a) {
		if (a.length == 0) {
			System.out.println("invalid input");
		} else {

			int[] duplicateArray = new int[a.length];
			for (int i = 0; i < a.length; i++) {
				duplicateArray[i] = 0;
			}
			HashSet<String> set = new HashSet<String>();
			boolean allOne = false;
			while (allOne == false) {
				int countOne = 0;
				int r = 1;
				int pos = a.length - 1;
				String s = "";
				while (r == 1 && pos >= 0) {
					duplicateArray[pos] = duplicateArray[pos] + r;
					if (duplicateArray[pos] > 1) {
						duplicateArray[pos] = 0;
						pos--;
						countOne++;
					} else {
						r = 0;
					}
				}
				if (countOne == a.length) {
					allOne = true;
				} else {
					for (int i = 0; i < a.length; i++) {
						if (duplicateArray[i] == 1) {
							s = s + a[i];

						}
					}
					set.add(s.toLowerCase());
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
		char[] chars = new char[] { 'a', 'b', 'c', 'd' };
		printAllCombo(chars);

	}

}
