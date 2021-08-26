package hackerRankExercises;

public class BeautifulDaysMovies {
	// TOD0:
	// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

	public static int beautifulDays(int i, int j, int k) {
		int count = 0;
		for (int idx = i; idx <= j; idx++) {
			int reverse = printNumberBackwards(idx);
			if ((Math.abs(idx - reverse)) % k == 0) {
				count++;
			}
		}
		return count;

	}

	public static int printNumberBackwards(int number) {
		int reversed = 0;
		while (number > 0) {
			reversed = reversed * 10 + number % 10;
			number = number / 10;
		}
		return reversed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(beautifulDays(13, 45, 3));
	}

}
