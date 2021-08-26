package hackerRankExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectronicsShop2 {
//TODO: https://www.hackerrank.com/challenges/electronics-shop/problem
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String lines;
		String linesKey;
		String linesDrivers;
		try {
			lines = br.readLine();
			String[] strs = lines.trim().split("\\s+");
			int budget = Integer.parseInt(strs[0]);
			int noKeyboards = Integer.parseInt(strs[1]);
			int noDrivers = Integer.parseInt(strs[2]);
			int[] keyboardPrices = new int[noKeyboards];
			int[] driversPrices = new int[noDrivers];

			linesKey = br.readLine();
			String[] keyboards = linesKey.trim().split("\\s+");
			for (int i = 0; i < noKeyboards; i++) {
				// System.out.println("price: ");
				// System.out.println();
				int price = Integer.parseInt(keyboards[i]);
				keyboardPrices[i] = price;
			}
			linesDrivers = br.readLine();
			String[] drivers = linesDrivers.trim().split("\\s+");
			for (int i = 0; i < noDrivers; i++) {
				// System.out.println("price: ");
				// System.out.println();
				int price = Integer.parseInt(drivers[i]);
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
					if (sum <= budget) {
						combination[k] = sum;
						// System.out.println("combination[k]: "+ combination[k]);
						k++;
						exists = true;
					}
				}
			}
			if (exists) {
				int max = 0;
				for (int i = 0; i < combination.length; i++) {
					if (combination[i] > max) {
						max = combination[i];
					}
				}
				System.out.println(max);
			} else {
				System.out.println(-1);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
