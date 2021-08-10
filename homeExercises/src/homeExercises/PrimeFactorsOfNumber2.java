package homeExercises;

public class PrimeFactorsOfNumber2 {

	public static void primeFactors(int n) {	
		int countPrimeDiv = 0;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0 && isPrime(i)) {
				countPrimeDiv++;
			}
		}
		int[] primeDivisors = new int[countPrimeDiv];
		int[] powers = new int[countPrimeDiv];
		int number = 0;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0 && isPrime(i)) {
				primeDivisors[number] = i;
				powers[number] = 0;
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
		primeFactors(36);
	}

}
