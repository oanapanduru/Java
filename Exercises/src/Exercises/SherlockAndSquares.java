package hackerRankExercises;

public class SherlockAndSquares {
	//TODO:https://www.hackerrank.com/challenges/sherlock-and-squares/problem
	public static int squares(int a, int b) {
	    // Write your code here
		int squares;
		int squareA =(int) Math.ceil(Math.sqrt(a));
//		System.out.println(squareA);
		int squareB =(int) Math.floor(Math.sqrt(b));
//		System.out.println(squareB);
		squares =  (squareB-squareA)+1;
//		System.out.println(squares);
		return squares;
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squares(17,24));
	}

}
