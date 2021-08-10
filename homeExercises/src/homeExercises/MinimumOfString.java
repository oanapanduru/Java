package homeExercises;

public class MinimumOfString {

	//TODO: Given a String s find the minimum of its letters: the letter which is first in the alphabet.
	//Tips: get each letter in the string as a char and compare it;
	public static char minimumOfChars(String s) {
		char c = 'z';
		for(int i= 0; i<s.length(); i++) {
			if (s.charAt(i) < c) {
				c = s.charAt(i);
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumOfChars("xysdcghytrafhbb"));
	}

}
