package conditionals;

public class TestNestedIf {

	public static void main(String[] args) {
		int i = 5;
		if (i == 4) {
			System.out.println("i is equal to 4");
		} else if (i < 6) {
			System.out.println("i is less than 6");
		} else if (i == 5) {
			System.out.println("i is equal to 5");
		} else {
			System.out.println("i is greater than 6");
		}

	}

}
