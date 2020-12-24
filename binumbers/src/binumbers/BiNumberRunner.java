package binumbers;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumbers numbers = new BiNumbers(2, 3);
		numbers.print();
		System.out.println(numbers.addNumbers());
		System.out.println(numbers.multiply());
		numbers.doubleNumbers();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}
}