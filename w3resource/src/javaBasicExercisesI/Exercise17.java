package javaBasicExercisesI;

import java.util.Scanner;

public class Exercise17 {

	public static String sumBinary() {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the first number (binary): ");
		String first = in.nextLine();
		System.out.print("enter the second number (binary): ");
		String second = in.nextLine();
		int sumFirst = 0;
		int sumSecond = 0;
		for (int i = 0; i < first.length(); i++) {
			if (i == 0) {
				sumFirst = (0 * 2) + Integer.parseInt(String.valueOf(first.charAt(i)));

			} else {
				sumFirst = (sumFirst * 2) + Integer.parseInt(String.valueOf(first.charAt(i)));
			}
		}
		for (int i = 0; i < second.length(); i++) {
			if (i == 0) {
				sumSecond = (0 * 2) + Integer.parseInt(String.valueOf(second.charAt(i)));
			} else {
				sumSecond = (sumSecond * 2) + Integer.parseInt(String.valueOf(second.charAt(i)));
			}
		}
		
		int decimal = sumFirst + sumSecond;
		String result = "";
		int remainder = 0;
		System.out.println("decimal before while: " + decimal);
		int [] temp = new int[10];
		int step = 0;
		while(decimal > 0) {
			remainder = decimal%2;
			decimal = decimal/2;
			temp[step] = remainder;
			step ++;
		//	if(decimal == 1) {
			//	remainder = 0;
			//	temp[step] = remainder;
			//}
			System.out.println("decimal: " + decimal);
			System.out.println("remainder: " + remainder);
			//result = result + remainder;
		}
		for (int i = step; i<temp.length; i++) {
			temp[i] = 2;
		}
		for(int i = temp.length-1; i>=0; i-- ) {
			if(temp[i]!=2) {
			result = result + temp[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumBinary());
	}

}
