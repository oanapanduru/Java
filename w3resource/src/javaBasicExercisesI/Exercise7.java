package javaBasicExercisesI;

import java.util.Scanner;

public class Exercise7 {

	public static void multiplicationTable() {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the number: ");
		int number = in.nextInt();
		for(int i=0; i<=10; i++) {
			System.out.println( number + " x " + i + " = " + number*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplicationTable();
	}

}
