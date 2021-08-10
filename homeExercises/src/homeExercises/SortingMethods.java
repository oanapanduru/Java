package homeExercises;

public class SortingMethods {

	//TODO: Sort two arrays using two different methods. You chose the methods. 
	//Tips: create two methods for each sorting method - each receive the array as parameter;
	//define the array in main method; call in main method each sorting method

	public static int[] selectionSort(int[] input) {
		int n = input.length;
		for(int i=0;i<n-1;i++) {
			int minIndex = i;
			for(int j = i+1; j<n;j++) {
				if(input[j]<input[minIndex]) {
					minIndex = j;
				}
			}
			int temp = input[minIndex];
			input[minIndex] = input[i];
			input[i] = temp;
		}
		return input;
	}
	
	
	public static int[] bubbleSort(int[] input) {
		int n = input.length;
		for(int i=0; i<n-1; i++) {
			for(int j =0; j< n-i-1; j++) {
				if(input[j]>input[j+1]) {
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		return input;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input = new int[] {3,2,1, 5,0, 59, -1};
		int[]result = selectionSort(input);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		int[]result2 = bubbleSort(input);
		for(int i=0; i<result2.length; i++) {
			System.out.print(result2[i] + " ");
		}
	}

}
