package hackerRankExercises;

import java.util.Scanner;

public class ElectronicsShop {

	// TODO:https://www.hackerrank.com/challenges/electronics-shop/problem

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(" what is the budget? ");
		int budget = in.nextInt();
		System.out.println("how many keyboards are?");
		int noKeyboards = in.nextInt();
		int[] keyboardPrices = new int[noKeyboards];
		for (int i = 0; i < noKeyboards; i++) {
			System.out.println("price: ");
			System.out.println();
			int price = in.nextInt();
			keyboardPrices[i] = price;
		}
		System.out.println("how many drivers are?");
		int noDrivers = in.nextInt();
		int[] driversPrices = new int[noDrivers];
		for (int i = 0; i < noDrivers; i++) {
			System.out.println("price: ");
			System.out.println();
			int price = in.nextInt();
			driversPrices[i] = price;
		}

		int count = 0;
		int sum = 0;
		for (int i = 0; i < noKeyboards; i++) {
			for (int j = 0; j < noDrivers; j++) {
				sum = keyboardPrices[i] + driversPrices[j];
				// System.out.println("sum in the nested fors: "+ sum);
				if (sum <= budget) {

					count++;
				}
			}
		}
		int[] combination = new int[count];
		int k = 0;
		boolean exists = false;
		for (int i = 0; i < noKeyboards; i++) {
			for (int j = 0; j < noDrivers; j++) {
				sum = keyboardPrices[i] + driversPrices[j];
				// System.out.println("sum in the nested fors: "+ sum);
				if (sum <= budget) {
					combination[k] = sum;
					// System.out.println("combination[k]: "+ combination[k]);
					k++;
					exists = true;
				}
			}
		}
		if(exists) {
			int max = 0;
			for (int i = 0; i < combination.length; i++) {
				if (combination[i] > max) {
					max = combination[i];
				}
			}
			System.out.println(max);
		}
		else {
			System.out.println(-1);
		}
	}
}
