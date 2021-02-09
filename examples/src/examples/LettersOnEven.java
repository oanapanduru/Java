package examples;

public class LettersOnEven {

	public static void main(String[] args) {
		String example = "alabalaportocala";
		for (int i = 0; i < example.length() - 1; i += 2) {
			System.out.println(example.charAt(i));
		}
	}

	}

