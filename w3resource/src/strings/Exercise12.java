package strings;

public class Exercise12 {

	public static boolean endsWith(String one, String two) {
		if(one.endsWith(two)) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(endsWith("hello there","ff"));
	}

}
