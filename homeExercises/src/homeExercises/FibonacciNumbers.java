package homeExercises;

public class FibonacciNumbers {
	// TODO:Write a program to print all numbers from Fibonacci list smaller than a
	// given int n.
	// Fibonacci list: first two numbers are 0 and 1; after them each number is
	// equal to the sum
	// of its two previous numbers: 0,1,1,2,3,5,8,13,21

	public static void fibonacciNumbers(int n) {
		int first = 0;
		int second = 1;
		System.out.print(first + " " + second + " ");
		while (first+second < n) {
			int temp = first + second;
			System.out.print(temp + " ");
			first = second;
			second = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacciNumbers(24);
	}

}
