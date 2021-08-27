package hackerRankExercises;

public class ViralAdvertising {

	// TODO: https://www.hackerrank.com/challenges/strange-advertising/problem
	public static int viralAdvertising(int n) {
		int total = 0;
		int temp = 0;
		int prev = 5;
		for(int i=0; i<n; i++) {
			total = prev/2;
			prev = total*3;
			temp = temp + total;
			total = 0;
			
			
		}
		
		return temp;

	}

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(viralAdvertising(5));

	}

}
