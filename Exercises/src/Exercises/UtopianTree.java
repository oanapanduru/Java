package hackerRankExercises;

public class UtopianTree {
	// TODO:https://www.hackerrank.com/challenges/utopian-tree/problem?h_r=next-challenge&h_v=zen

	public static int utopianTree(int n) {
		// Write your code here
		int height = 1;
		if (n == 0) {
			height = 1;
		} else if (n == 1) {
			height = 2;
		} else {
			height =1;
			for (int i = 0; i < n; i++) {
				if(i%2==0) {
					height = height*2;
				}
				else if(i%2!=0) {
					height = height+1;
				}
			}
		}
		return height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(utopianTree(1));
	}

}
