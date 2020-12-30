package interestCalculator;

public class InterestCalculatorRunner {

	public static void main(String[] args) {
		InterestCalculator calculator = new InterestCalculator(100, 0.02f, 5);
		System.out.println(calculator.ammountWithInterest());
	}

}
