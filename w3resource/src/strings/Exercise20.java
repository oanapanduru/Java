package strings;

public class Exercise20 {

	
	public static void StringCanonicalComp(String first) {
		String input = new String(first);
		String third = input.intern();
		System.out.println(first==input);
		System.out.println(first==third);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCanonicalComp("hello");
	}

}
