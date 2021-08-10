package homeExercises;

public class FindAllDivisorsOfANumber {

	// TODO: Given an int n, find all its divisors.
	// (A divisor is a number less than the number and if you divide the number to
	// the divisor the reminder of the operation is 0).
	// Steps:
	// Create a for with i from 2 to half of n - a divisor of n cannot be bigger
	// that half of length;
	// we cannot divide a number by 0 and 1 is divisor for all numbers;
	// For each number i see if it is a divisor of n;
	// if n divided by i has reminder 0 than i is a divisor - store it in an array
	// of divisors;

	public static int[] findAllDivisorsOfNumber(int n) {
		int[] divisors = new int[n / 2 + 1];
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				divisors[i] = i;
				count++;
			}
		}
		int[] divisor = new int[count];
		int number = 0;
		for (int j = 0; j < divisors.length; j++) {
			if (divisors[j] > 0 && number < divisor.length) {
				divisor[number] = divisors[j];
				number++;
			}

		}
		return divisor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] divisors = findAllDivisorsOfNumber(1000);
		for (int i = 0; i < divisors.length; i++)
			System.out.print(divisors[i] + " ");
	}

}
