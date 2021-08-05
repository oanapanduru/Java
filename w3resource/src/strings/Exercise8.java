package strings;

public class Exercise8 {

	public static boolean containsSequence(String input, String sequence) {
		if(input.contains(sequence)) {
		return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(containsSequence("hello there", "f"));
	}

}
