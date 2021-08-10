package homeExercises;

// TODO: Write a method that has two parameters: String s and char c.
//Insert char c at each index of String s and print it. 
//The letters after insertion in s have to be moved by one position to the right.

public class InsertCharAtEachIndex {

	public static void insertCharAtEachIndex(String input, char c) {
		//String result = "";
		for(int i =0; i<=input.length(); i++) {
			String result = input.substring(0, i) + c + input.substring(i);
			System.out.println(result);
		}

	}
	
	public static String insertAtEach(String input, char c) {
		String newString = "";
		for(int i =0; i<input.length(); i++) {
			//stringulNou = stringulNou + x + charAt(i)
			newString = newString + c + input.charAt(i);
		}
		newString = newString + c;
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertCharAtEachIndex("hello", 'x');
		System.out.println(insertAtEach("hello", 'x'));
	}

}
