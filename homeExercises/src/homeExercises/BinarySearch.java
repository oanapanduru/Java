package homeExercises;

public class BinarySearch {
	//TODO: Given an array of int values find an element i.
	
	public static int searchForElement(int[]input, int i) {
		int low = 0,
		high =input.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (input[middle] == i)
                return middle;

            if (input[middle] < i)
                low = middle + 1;

            else
                high = middle - 1;
        }
        return -1;
	}
	
	public static int binarySearch(int[]input, int i) {
		int low = 0;
		int high = input.length-1;
		while(low<=high) {
			int middle = low + (high-low)/2;
			if(input[middle]==i) {
				return middle;
			}
			if(input[middle]<i) {
				low = middle+1;
			}
			else {
				high = middle -1;
			}
			
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input = new int[] {0,1,2,3,4,5,6};
		System.out.println(binarySearch(input,6));
	}

}
