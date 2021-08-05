package strings;

public class Exercise19 {

	public static int printIndexOfChar(char c) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int index = 0;
		char[] chars = alphabet.toLowerCase().toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == c) {
				index = i;
			}
		}
		return index;
	}

	public static void printIndexesOfAllChars(String input) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] chars = alphabet.toLowerCase().toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				for (int j = 0; j < chars.length; j++) {
					if (chars[j] == input.charAt(i)) {
						System.out.println("char: " + input.charAt(i) + " has index in alphabet: " + j);
						break;
					}
				}
			}
		}
	}

	public static void printIndex(String input) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] chars = alphabet.toLowerCase().toCharArray();
		for (int j = 0; j < chars.length; j++) {
			for (int i = 0; i < input.length(); i++) {
				if (Character.isLetter(input.charAt(i))) {
					if (chars[j] == input.charAt(i)) {
						System.out.println("char: " + chars[j] + " has index : " + i);
						break;
					}
				}
			}
		}
	}

	public static void printIndexUsingChar(String input) {
		char letter = 'a';
		while (letter <= 'z') {
			System.out.println(letter + " " + input.indexOf(letter));
			letter++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(printIndexOfChar('a'));
		// printIndexesOfAllChars("The quick brown fox jumps over the lazy dog.");
		// printIndexUsingChar("The quick brown fox jumps over the lazy dog");
		printIndex("The quick brown fox jumps over the lazy dog");
	}

}
