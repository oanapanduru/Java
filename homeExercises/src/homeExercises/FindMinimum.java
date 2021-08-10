package homeExercises;

public class FindMinimum {

	//TODO: Given an array of int values find the minimum of the values
	 public static int findMinimum(int [] input) {
		 int n = input.length;
		 for(int i =0; i<n-1; i++) {
			 int minIdx = i;
			 for(int j = i+1; j<n;j++) {
				 if(input[j]<input[minIdx] ) {
					 minIdx=j;
				 }
			 }
			 int temp = input[minIdx];
			 input[minIdx] = input[i];
			 input[i] = temp;
		 }
		 return input[0];
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input = new int[] {3,2,1,5,0, 59,};
		
		System.out.println(findMinimum(input));
	}

}
