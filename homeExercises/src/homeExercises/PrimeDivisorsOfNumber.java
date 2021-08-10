package homeExercises;

public class PrimeDivisorsOfNumber {

	// TODO:Write a program that finds only the prime divisors of a number (an
	// integer) n.
	// Steps:
	// Create a for with i from 2 to half of n;
	// For each number i see if it is a divisor of n and if it is prime; if this is
	// true - store it in an array of prime;

	public static int[] primeDivisorsOfNumber(int n) {
		int[] primeDivisors = new int[n / 2 + 1];
		int count = 0;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0 && isPrime(i)) {
				primeDivisors[i] = i;
				count++;
			}
		}
		int[] result = new int[count];
		int number = 0;
		for (int j = 0; j < primeDivisors.length; j++) {
			if (primeDivisors[j] > 0 && number < result.length) {
				result[number] = primeDivisors[j];
				number++;
			}

		}
		return result;
	}

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
		int[] primeDivisors = primeDivisorsOfNumber(12);
		for (int i = 0; i < primeDivisors.length; i++)
			System.out.print(primeDivisors[i] + " ");
	}
}
