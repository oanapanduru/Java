package arrays;

import java.math.BigDecimal;
import java.util.Arrays;

public class Employee {
	private String name;
	private int[] target;

	Employee(String name, int... target) {
		this.name = name;
		this.target = target;
	}

	void getNumberOfTarget() {
		int number = this.target.length;
		System.out.println(number);
	}

	int getTotalOfTargets() {
		int sum = 0;
		for (int i : this.target) {
			sum = sum + i;
		}
		return sum;
	}

	int getMax() {
		int max = 0;
		for (int i : this.target) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

	int getMin() {
		int min = this.target[0];
		for (int i : this.target) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}

	void getMinAndMax() {
		Arrays.sort(this.target);
		System.out.println("maximum value:  " + this.target[this.target.length - 1]);
		System.out.println("minimum value:  " + this.target[0]);

	}

	BigDecimal getAverage() {
		int sum = getTotalOfTargets();
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(this.target.length));
		return average;
	}
}