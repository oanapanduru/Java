package hackerRankExercises;

public class DrawingBook {

	// TODO:https://www.hackerrank.com/challenges/drawing-book/problem
	public static int pageCount(int n, int p) {
		// int count = 0;
		int min = 0;
		if (n == 1 || n == p - 1) {
			return min;
		}

		else {
			int countFront = p / 2;
			int countBack = n / 2 - p / 2;

			if (countFront < countBack) {
				min = countFront;
			}
			if (countFront > countBack) {
				min = countBack;
			}
		}
		return min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pageCount(6, 3));
	}

}
