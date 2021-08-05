package tests;

import java.util.ArrayList;
import java.util.List;

public class PrintRatio {
	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		int[] input = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			input[i] = arr.get(i);
		}
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;
		float positiveRatio;
		float negativeRatio;
		float zeroRatio;

		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				countPositive++;
			} else if (input[i] < 0) {
				countNegative++;

			} else  {
				countZero++;

			}
		}
		System.out.println(countPositive);
		System.out.println(input.length);
		//positiveRatio = countPositive / input.length;
		System.out.println(countNegative);
		//System.out.println(input.length);
		positiveRatio = (float) countPositive / input.length;
		System.out.println(positiveRatio);
		negativeRatio =(float)  countNegative / input.length;
		zeroRatio = (float) countZero / input.length;
		System.out.printf("%.6f", positiveRatio);
		System.out.println();
		System.out.printf("%.6f", negativeRatio);
		System.out.println();
		System.out.printf("%.6f", zeroRatio);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myNum = new ArrayList<Integer>();
		myNum.add(10);
		myNum.add(0);
		myNum.add(5);
		myNum.add(-10);
		myNum.add(19);
		myNum.add(89);
		plusMinus(myNum);
	}

}
