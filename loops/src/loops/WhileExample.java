package loops;

public class WhileExample {
	private int limit;

	WhileExample(int limit) {
		this.limit = limit;
	}

	void squaresOfNumbers() {
		int currentNumber = 1;
		while (currentNumber * currentNumber < this.limit) {
			System.out.println(currentNumber * currentNumber);
			currentNumber++;

		}

	}

	void Cubes() {
		int currentNumber = 1;
		while (currentNumber * currentNumber  * currentNumber < this.limit) {
			System.out.println(currentNumber * currentNumber * currentNumber);
			currentNumber++;
	}
}
}
