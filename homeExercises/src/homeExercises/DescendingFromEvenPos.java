package homeExercises;

public class DescendingFromEvenPos {
	//TODO:Given an array a create a new array b that has all the values from even position of array a sorted in descending order.
	//Example: [35,8,9,3,24,2] print [9,24,35]
	public static void descendingFromEvenPos(int[]a) {	
		int[] b = new int[(a.length + 1) / 2];
	    for (int i = 0; i < b.length; i++) {
	        b[i] = a[i * 2];
	    }

		for (int i = 0; i < b.length - 1; i++) {
			int maxIdx = i;
			for (int j = i + 1; j < b.length; j++) {
				if (b[j] > b[maxIdx]) {
					maxIdx = j;
				}
			}
			int temp = b[maxIdx];
			b[maxIdx] = b[i];
			b[i] = temp;
		}
		 
	    
//	    for (int i = 0; i < b.length - 1; i++) {
//			for (int j = 0; j < b.length - i - 1; j++) {
//				if (b[j]< b[j + 1]) {
//					int temp = b[j];
//					b[j] = b[j + 1];
//					b[j + 1] = temp;
//				}
//			}
//		}
	      
	    
	    for(int j=0; j<b.length; j++) {
	    	System.out.println(b[j]);
	    }
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = new int[]{35,8,9,3,24,2};
		descendingFromEvenPos(a);
	}

}
