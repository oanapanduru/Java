package homeExercises;

public class FirstOccurencyOfChar {
	// TODO:Given a String s and a char c find first occurrence index of char c in
	// String s;

	public static int firstOccurencyOfChar(String s, char c) {
		int index = -1;
		// boolean exists = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				index = i;
				break;
			}
		}
		return index;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstOccurencyOfChar("alabala", 'x'));
	}

}
