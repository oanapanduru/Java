package referenceTypes;

public class StringExample {

	public static void main(String[] args) {
		String example = "this is an example that I will want to print letter by letter";
		for (int i = 0; i < example.length(); i++) {
			System.out.println(example.charAt(i));
		}

	}

}
