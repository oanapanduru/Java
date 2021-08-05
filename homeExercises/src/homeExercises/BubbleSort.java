package homeExercises;

public class BubbleSort {

	public static int[] bubbleSort(int[] myArray) {
		int n = myArray.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (myArray[j] > myArray[j + 1]) {
					int temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
				}
			}
		}
		return myArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[] { 1, 5, 6, 7, 2, 3, 8 };
		int[] sorted = bubbleSort(myArray);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
	}

}
