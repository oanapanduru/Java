package javaBasicExercisesI;

import java.util.Scanner;

public class Exercise5 {

	public static int printMultiplicationResult() {
		Scanner in = new Scanner(System.in);
		System.out.print("first number: ");
		int a = in.nextInt();
		System.out.print("second number: ");
		int b = in.nextInt();
		return a*b;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printMultiplicationResult());
	}

}
