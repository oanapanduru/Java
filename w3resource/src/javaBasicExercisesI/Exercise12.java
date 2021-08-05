package javaBasicExercisesI;

import java.util.Scanner;

public class Exercise12 {

	public static void printAverage() {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int first = in.nextInt();
		System.out.print("enter the second number: ");
		int second = in.nextInt();
		System.out.print("enter the third number: ");
		int third = in.nextInt();
		System.out.println((first+second+third)/3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAverage();
	}

}
