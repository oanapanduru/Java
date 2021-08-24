package hackerRankExercises;

public class CountingMountains {
	public static int countingMountains(String path) {
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
			if (currentLevel > 0) {
				count++;
				while (currentLevel > 0) {
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

	public static int countingMountains2(String path) {
		int countD = 0;
		int countU = 0;
		int count = 0;
		int i = 0;
		while (i < path.length()) {
			if (path.charAt(i) == 'D') {
				countD++;
			}
			if (path.charAt(i) == 'U') {
				countU++;
			}
			if (countD > countU) {
				countD = 0;
				//i++;
			}
			if (countD == countU  && (countD>0 && countU>0)) {
				count++;
				countD = 0;
				countU = 0;
			}
			System.out.println(path.charAt(i) + " " + count);
			i++;

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8
		// UDDDUDUU
		// System.out.println(countingMountains("DDUUDDUDUUUD"));
		// System.out.println(countingMountains("UUDDUD"));
		// System.out.println(countingMountains2("DDUUDDUDUUUD"));
		//System.out.println(countingMountains2("DDUDUDUDUU"));
		System.out.println(countingMountains2("DDUUUUDDDDUUDD"));
	}

}
