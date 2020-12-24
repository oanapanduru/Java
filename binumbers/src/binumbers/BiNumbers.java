package binumbers;

public class BiNumbers {
	private int number1;
	private int number2;

	BiNumbers(int a, int b) {
		this.number1 = a;
		this.number2 = b;
	}

	int getNumber1() {
		return this.number1;
	}

	int getNumber2() {
		return this.number2;
	}

	void print() {
		System.out.println(this.number1);
		System.out.println(this.number2);
	}


	int addNumbers() {
		int c = this.number1 + this.number2;
		return c;
	}

	int multiply() {
		return this.number1 * this.number2;
	}

	void doubleNumbers() {
		this.number1 = this.number1 * 2;
		this.number2 = this.number2 * 2;
	}
}
