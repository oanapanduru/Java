package hackerRankExercises;

import java.math.BigInteger;

public class ExtraLongFactorials {
//TODO:https://www.hackerrank.com/challenges/extra-long-factorials/problem?h_r=next-challenge&h_v=zen
	public static void extraLongFactorials(int n) {
		// Write your code here
		BigInteger number = new BigInteger("1");
		while(n>0) {
			number = number.multiply(number.valueOf(n));
			n=n-1;
		}
		System.out.println(number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extraLongFactorials(25);
	}

}
