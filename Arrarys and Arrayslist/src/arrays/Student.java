package arrays;

import java.math.BigDecimal;
import java.util.Arrays;

public class Student {
	private String name;
	private int[] marks;

	Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	void getNumberOfMarks() {
		int number = this.marks.length;
		System.out.println(number);
	}

	int getTotalOfMarks() {
		int sum = 0;
		for(int i:this.marks) {
			sum = sum + i;
		}
		return sum;
	}

	int getMax() {
		int max = this.marks[0];
		for (int i : this.marks) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

	int getMin() {
		int min = this.marks[0];
		for (int i : this.marks) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}

	void getMinAndMax() {
		Arrays.sort(this.marks);
		System.out.println("maximum value:  " + this.marks[this.marks.length - 1]);
		System.out.println("minimum value:  " + this.marks[0]);

	}
	
	BigDecimal getAverage() {
		int sum = getTotalOfMarks();
		BigDecimal average2 = new BigDecimal(sum).divide(new BigDecimal(this.marks.length));
		return average2;
	}
}
