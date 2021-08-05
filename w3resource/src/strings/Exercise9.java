package strings;

public class Exercise9 {

	public static void compareCharSequence(String input, CharSequence chars) {
		System.out.println(input.contentEquals(chars));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareCharSequence("bye bye hello","bye bye hello");
	}

}
