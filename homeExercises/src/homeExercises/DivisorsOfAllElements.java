package homeExercises;

public class DivisorsOfAllElements {

	//TODO:Given two arrays of ints arr1 and arr2. Check if all elements in arr1 are divisors of all elements in arr2.
	
	public static boolean divisorsOfAllElements(int[]arr1, int[]arr2) {
		boolean divisorsOfAll = true;
		for(int i=0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if(arr2[j]%arr1[i]!=0) {
					divisorsOfAll  = false;
					break;
				}
			}
		}
		return divisorsOfAll;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1 = new int[] {2,4,8,7};
		int[]arr2 = new int[] {16,24,48};
		System.out.println(divisorsOfAllElements(arr1, arr2));
	}

}
