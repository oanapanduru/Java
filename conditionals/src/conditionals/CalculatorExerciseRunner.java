package conditionals;

public class CalculatorExerciseRunner {

	public static void main(String[] args) {
		CalculatorExercise calculator = new CalculatorExercise();
		calculator.getNumber1();
		calculator.getNumber2();
		calculator.getOperation();
		System.out.println(calculator.calculate());

	}

}
