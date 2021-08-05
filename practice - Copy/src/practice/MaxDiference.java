package practice;

public class MaxDiference {

	public static int maxDifference() {
		int[]vals = {2,5,7,9,4};
		int max = 0;
		for(int i=0; i<vals.length;i++) {
			System.out.println("this is i: "+ i);
			for(int j=0; j<vals.length; j++ ) {
				System.out.println("this is j: "+ j);
				if(vals[i]-vals[j]>max) {
					max = vals[i]- vals[j];
					System.out.println("this is max: "+ max);
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxDifference());
	}

}
