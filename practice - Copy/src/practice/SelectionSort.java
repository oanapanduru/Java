package practice;

import java.util.Arrays;

public class SelectionSort {
	public String selectionSort(int input[]) {
		// i starting from 0 to the input length - 1
		for (int i = 0; i < input.length - 1; i++) {
			System.out.println("this is i: " + i );
			int indexOfMin = i;
			System.out.println("this is minIndex: " + indexOfMin );
			// j starting from i + 1 to the input length
			for (int j = i + 1; j < input.length; j++) {
				System.out.println("this is j: " + j );
				if (input[j] < input[indexOfMin]) {
					indexOfMin = j;
				}
			}
			// temp = input[element found as min.( at index j)]
			//String result = Arrays.toString(input);
			//System.out.println("before the swap: "+ result);
			//System.out.println(result);
			int temp = input[indexOfMin];
			System.out.println("this is temp: " + temp );
			// switching j to i --- input[j] = input[i]
			input[indexOfMin] = input[i];
			System.out.println("this is value at minIndex: " + input[indexOfMin] );
			// switching i to j (initial value before the assignment) --- input[i] = temp
			System.out.println("this is value at i: " + input[i] );
			input[i] = temp;
			//String result = Arrays.toString(input);
			//System.out.println("after the swap: "+ result);
		}
		String result = Arrays.toString(input);
		return result;

	}
}
