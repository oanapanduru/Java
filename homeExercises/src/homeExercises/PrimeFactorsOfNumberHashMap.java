package homeExercises;

import java.util.HashMap;

public class PrimeFactorsOfNumberHashMap {

	// TODO: Write a program that finds the prime factors of a number n: find all
	// the prime divisors
	// and the power of each prime divisor
	// Use a HashMap to store the divisors and their powers; - use the divisor as a
	// key and the power as the value;

	public static void primeFactors(int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i = 2;
		int power = 1;
		while (n > 1) {
			while (n % i == 0 && isPrime(i)) {
				n = n / i;
				if (map.containsKey(i)) {
					map.put(i, map.get(i) + 1);
				} else {
					map.put(i, power);
				}
			}
			i++;
		}
		for (Integer j : map.keySet()) {
			System.out.println(j + " at power " + map.get(j));
		}
	}

	// create helper method to check if a number is prime
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeFactors(18);
	}

}
