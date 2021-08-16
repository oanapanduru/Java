package homeExercises;

public class MultipleOfNumber {
	//TODO:Given an array of ints arr and an int x. 
	//Check if all elements in arr are multiples of x ( if x is their divisor). 
	
	public static boolean multipleOfNumber(int[]arr, int x) {
		boolean multipleOfX = true;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%x !=0) {
				multipleOfX = false;
				break;
			}
		}
		return multipleOfX;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = new int[] {2,4,6,8,10,7};
		int x= 2;
		System.out.println(multipleOfNumber(arr, x));
	}

}
