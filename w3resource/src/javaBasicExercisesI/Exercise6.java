package javaBasicExercisesI;

import java.util.Scanner;

public class Exercise6 {
	
	public static void printMath() {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int first = in.nextInt();
		System.out.print("enter the second number: ");
		int second = in.nextInt();
		System.out.println(first + " + " + second  + " = "+  (first+second)+  "\n" +
		first + " - " + second  + " = "+ (first-second)+  "\n" + 
		first + " x " + second  +  " = "+ (first*second)+  "\n"  +
		first + " / " + second  + " = "+ (first/second)+  "\n" + 
		first + " mod " + second  +  " = "+ (first%second));
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMath();
	}

}
