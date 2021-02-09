package examples;

public class StringComparison {

	public static void main(String[] args) {
		String test1 = "hello there";
		String test2 ="hello";
		if (test1.length() == test2.length()) {
			System.out.println("they are equal");
		}
		else if(test1.length() < test2.length()) {
			System.out.println("test2 is longer");
		}
	else {
		System.out.println("test1 in longer");
	}

}
}
