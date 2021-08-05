package homeExercises;

public class SelectionSort {

	public static int[] selectionSort(int[] myArray) {
		int n = myArray.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			System.out.println("minIndex initial:" + minIndex);
			System.out.println("i:" + i);
			
			for (int j = i + 1; j < n; j++) {
				System.out.println("j:" + j);
				if (myArray[j] < myArray[minIndex]) {
					minIndex = j;
					System.out.println("minIndex:" + minIndex);
				}
			}
			System.out.println("swaping");
			int temp = myArray[minIndex];
			myArray[minIndex] = myArray[i];
			myArray[i] = temp;
		}

		return myArray;
	}

	public static void main(String[] args) {
		int[] myArray = new int[] { 1,4,3,2 };
		int[] sorted = selectionSort(myArray);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
	}

}
