package strings;

public class Exercise4 {

	
	public static void codePointrange(String input, int index1, int index2) {
		if(index1>=0  && index1 < input.length()&& index2>=index1 && index2<input.length()) {
			System.out.println(input.codePointCount(index1, index2));
		}
		else {
			System.out.println("invalid indexes");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		codePointrange("hello there", 0,6);
	}

}
