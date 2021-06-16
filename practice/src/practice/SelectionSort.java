package practice;

import java.util.Arrays;

public class SelectionSort {
	public String selectionSort(int input[]) {
		// i starting from 0 to the input length - 1
		for (int i = 0; i < input.length - 1; i++) {
			int indexOfMin = i;
			// j starting from i + 1 to the input length
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[indexOfMin]) {
					indexOfMin = j;
				}
			}
			// temp = input[element found as min.( at index j)]
			int temp = input[indexOfMin];
			// switching j to i --- input[j] = input[i]
			input[indexOfMin] = input[i];
			// switching i to j (initial value before the assignment) --- input[i] = temp
			input[i] = temp;
		}
		String result = Arrays.toString(input);
		return result;

	}
}
