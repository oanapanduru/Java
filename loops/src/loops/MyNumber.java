package loops;

public class MyNumber {
	private int number;

	MyNumber(int number) {
		this.number = number;
	}

	boolean isPrime() {
		for (int i = 2; i <= this.number - 1; i++) {
			if (this.number % i == 0) {
				return false;
			}
		}
		return true;
	}

	int sumOfNumbers() {
		int sums = 0;
		for (int i = 0; i <= this.number; i++) {
			sums = sums + i;
		}
		return sums;
	}

	int sumOfDivisors() {
		int sums = 0;
		for (int i = 2; i < this.number; i++) {
			if (this.number % i == 0) {
				sums = sums + i;
			}
		}
		return sums;
	}

	void printTriangle() {
		for (int i = 1; i <= this.number; i++) {
			for (int number2 = 1; number2 <= i; number2++) {
				System.out.print(number2 + " ");

			}
			System.out.println();
		}
	}
}
