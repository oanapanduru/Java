package homeExercises;

public class HalfArray {

	//TODO:Given an array of ints arr. Find the sum for the first half and the multiplication for the second half. 
	//If arr has an odd number of elements put the element from the middle in the first half.
	public static void sumAndMultiplication(int[]arr) {
		int middle = 0;
		if(arr.length%2==0) {
			middle=arr.length/2;
		}
		else {
			middle = arr.length/2 +1;
		}
		int sum = 0;
		for(int i=0; i<middle; i++) {
			sum = sum+arr[i];
		}
		int multiplication = 1;
		for(int i=middle; i<arr.length; i++) {
			multiplication = multiplication*arr[i];
		}
		System.out.println(middle);
		System.out.println(sum);
		System.out.println(multiplication);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 3, 1, 5, 6, 1, 1, 1, 9};
		sumAndMultiplication(arr);
	}

}
