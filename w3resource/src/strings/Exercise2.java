package strings;

public class Exercise2 {

	
	public static void printUnicode(String input, int index) {
		if(index<input.length() && index>=0) {
			System.out.println(input.codePointAt(index));
		}
		else {
			System.out.println("not a valid index");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printUnicode("hello", 5 );
	}

}
