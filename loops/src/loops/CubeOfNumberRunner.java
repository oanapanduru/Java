package loops;

import java.util.Scanner;

public class CubeOfNumberRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("cube is:" + (number * number * number));
			System.out.print("Enter number:  ");
			number = scanner.nextInt();

		} while (number >= 0);
		System.out.println("invalid input");
	}

}
