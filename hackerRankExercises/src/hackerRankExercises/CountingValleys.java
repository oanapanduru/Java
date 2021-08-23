package hackerRankExercises;

public class CountingValleys {

	// TODO:https://www.hackerrank.com/challenges/counting-valleys/problem
	public static int countingValleys(int steps, String path) {
		// Write your code here
		int count = 0;
		int currentLevel = 0;
		int i = 0;
		while (i < path.length()) {
			if (path.charAt(i) == 'D') {
				currentLevel--;
			}
			if (path.charAt(i) == 'U') {
				currentLevel++;
			}
			if (currentLevel < 0) {
				count++;
				while(currentLevel < 0) {
					i++;
					if (path.charAt(i) == 'D') {
						currentLevel--;
					}
					if (path.charAt(i) == 'U') {
						currentLevel++;
					}
				}
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8
		// UDDDUDUU
		System.out.println(countingValleys(8, "DDUUDDUDUUUD"));
	}

}
