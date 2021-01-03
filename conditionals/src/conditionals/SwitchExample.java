package conditionals;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number1:  ");
		int number1 = scanner.nextInt();
		System.out.println("the number you entered is " + number1);

		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter number2:  ");
		int number2 = scanner.nextInt();
		System.out.println("the number you entered is " + number2);

		Scanner scanner3 = new Scanner(System.in);
		System.out.print("Enter choice:1)add; 2)subtract; 3)multiply; 4)divide;  ");
		int choice = scanner.nextInt();
		System.out.println("the number you entered is " + choice);

		System.out.println("your choices are:" + number1 + " " + number2 + " " + choice);

		extractedMethodConditionals(number1, number2, choice);
	}

	private static void extractedMethodConditionals(int number1, int number2, int choice) {
		if (choice == 1) {
			System.out.println("result is:" + (number1 + number2));
		} else if (choice == 2) {
			System.out.println("result is:" + (number1 - number2));
		} else if (choice == 3) {
			System.out.println("result is" + (number1 * number2));
		} else if (choice == 4) {
			System.out.println("result is" + (number1 / number2));
		} else {
			System.out.println("invalid input");
		}
	}

	private static void extractedMethodConditionalsSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("result is:" + (number1 + number2));
			break;
		case 2:
			System.out.println("result is:" + (number1 - number2));
			break;
		case 3:
			System.out.println("result is" + (number1 * number2));
			break;
		case 4:
			System.out.println("result is" + (number1 / number2));
			break;
		default:
			System.out.println("invalid input");
			break;
		}
	}
}
