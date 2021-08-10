package homeExercises;

public class IsPrime {

	
	//TODO: Given an int n write a program to determine it the number is prime.
	//( A number is prime if it has only two divisors: 1 and itself).
	//Steps:
	//We create a boolean variable isPrime with values true - we assume that n is prime;
	//We create a for with i from 2 to half of n to search if n has a divisor;
	//For each number i we check if the reminder of n / i is 0; if it is 0 that we found a divisor of n (different from 1 and n itself)
	//- this means n is not a prime number; we set our variable isPrime with value false and we break from the loop
	//- we found a divisor we don’t have to search more;
	//After the loop we check the isPrime variable - it it is still true than the number is prime; otherwise it’s not; 

	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for(int i = 2; i<=n/2; i++) {
			if(n%i ==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(4));
		
	}

}
