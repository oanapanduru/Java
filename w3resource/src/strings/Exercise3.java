package strings;

public class Exercise3 {

	public static void printUnicodeBefore(String input, int index) {
		if(index-1 <= input.length() && index-1 >= 0) {
			System.out.println("character befor index: " + input.charAt(index-1)+ " "+input.codePointBefore(index));
		}
		else {
			System.out.println("invalid index");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printUnicodeBefore("hello there", 5);
	}

}
