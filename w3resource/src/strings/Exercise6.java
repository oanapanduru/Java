package strings;

public class Exercise6 {

	public static void compareIgnoreCase(String first, String second) {
		if(first.equalsIgnoreCase(second)) {
			System.out.println("they are equal");			
		}
		else {
			System.out.println(" they are not equal");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareIgnoreCase("hello", "hello");
	}

}
