package homeExercises;

public class InsertCharAtPosition {

	// TODO Write a method that has three parameters: String s, char c and int i;
	// where i is less than the length of the string. Insert char c at the position
	// i of s and print it.
	// The letters after position i in s have to be moved by one position to the
	// right.

	public static String insertCharAtPosition(String s, char c, int i) {
		String result = "";
		if (i <= s.length()) {
			for (int j = 0; j <=s.length(); j++) {
				if (j == i ) {
					result = s.substring(0, i) + c + s.substring(i);
				}
			}

		} else {
			System.out.println("invalid index");
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(insertCharAtPosition("hello", 'x', 5));
	}

}
