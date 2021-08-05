package strings;

public class Exercise1 {

	public static char charAtIndex(String input, int index) {
		char toBeReturned = 0;
		if (index <= input.length()-1 && index >= 0) {
			toBeReturned = input.charAt(index);
		}
		else {
			return '.';
		}
		return toBeReturned;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(charAtIndex("hello there", 2));
	}

}
