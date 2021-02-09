package examples;

public class LettersOnMultipleOfThree {

	public static void main(String[] args) {
		String example = "elefant";
		int start = example.length() - 1 - (example.length() - 1) % 3;
		System.out.println(start);
		/*
		 * if (start % 3 == 1) { start = start - 1; } else if (start % 3 == 2) { start =
		 * start - 2;
		 * 
		 * }
		 */

		for (int i = start; i >= 0; i -= 3) {
			System.out.println(example.charAt(i));
		}
	}

}
