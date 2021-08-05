package strings;

public class Exercise10 {

	public static void compareWithBuffer(String input, StringBuffer compare) {
		System.out.println(input.contentEquals(compare));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareWithBuffer("hello there",  new StringBuffer("hello there"));
	}

}
