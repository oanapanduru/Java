package homeExercises;

public class PrimeFactorsOfNumber {
	// TODO:Write a program that finds the prime factors of a number n:
	// find all the prime divisors and the power of each prime divisor
	// Use arrays to store the divisors and their powers;

	public static void primeFactors(int n) {
		int[] primes = new int[n / 2 + 1];
		int countPrimeDiv = 0;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0 && isPrime(i)) {
				primes[i] = i;
				countPrimeDiv++;
			}
		}
		int[] primeDivisors = new int[countPrimeDiv];
		int[] powers = new int[countPrimeDiv];
		int number = 0;
		for (int j = 0; j < primes.length; j++) {
			if (primes[j] > 0 && number < primeDivisors.length) {
				primeDivisors[number] = primes[j];
				number++;
			}
		}
		int i = 0;
		while (n > 1) {

			while (n % primeDivisors[i] == 0 && i < primeDivisors.length) {
				powers[i]++;
				n = n / primeDivisors[i];
			}

			i++;
		}
		for (int j = 0; j < primeDivisors.length; j++)
			System.out.println(primeDivisors[j] + " at power " + powers[j]);
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
		primeFactors(12);
	}

}
