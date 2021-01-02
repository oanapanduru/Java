package conditionals;

import java.util.Scanner;

public class CalculatorExercise {
	private int number1;
	private int number2;
	private int operation;



	int getNumber1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number1:  ");
		this.number1 = scanner.nextInt();
		System.out.println("the number you entered is " + number1);
		return number1;
	}

	int getNumber2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number2:  ");
		this.number2 = scanner.nextInt();
		System.out.println("the number you entered is " + number2);
		return number2;
	}

	int getOperation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose your operation: 1) add; 2) subtract; 3) multiply; 4) divide;");
		System.out.print("Enter operation:  ");
		this.operation = scanner.nextInt();
		if (this.operation == 1) {
			System.out.println("the choosen operation is: add");
		} else if (this.operation == 2) {
			System.out.println("the choosen operation is: substract");
		} else if (this.operation == 3) {
			System.out.println("the choosen operation is: multiply");
		} else if (this.operation == 4) {
			System.out.println("the choosen operation is: divide");
		}
		else {
			System.out.println("invalid input");
		}
		return operation;
	}

	int calculate() {
		int result = 0;
		if (this.operation == 1) {
			result = this.number1 + this.number2;
		} else if (this.operation == 2) {
			result = this.number1 - this.number2;
		} else if (this.operation == 3) {
			result = this.number1 * this.number2;
		} else if (this.operation == 4) {
			result = this.number1 / this.number2;
		} else {
			System.out.println("invalid input");
		}
		System.out.println("the result is:");
		return result;
	}
}
