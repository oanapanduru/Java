package examples;

public class Index {

	public static void main(String[] args) {
		String example = "alabalaportocalar";
		int start = example.length() - 1;
		if (start % 2 == 1) {
			start = start - 1;
		}
		for (int i = start; i >= 0; i -= 2) {
			System.out.println(example.charAt(i));
		}
	}

}
