package hackerRankExercises;

public class LibraryFine {

	// TODO:https://www.hackerrank.com/challenges/library-fine/problem
	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		// Write your code here
		int fine = 0;
		if (y1 < y2) {
			fine = 0;
		} else {
			if (y1 > y2) {
				fine = 10000;
			} else {
				if (m1 < m2) {
					fine = 0;
				} else {
					if (m1 > m2) {
						fine = 500 * (m2 - m1);
					} else {
						if (d1 > d2) {
							fine = 15 * (d2 - d1);
						} else {
							fine = 0;
						}
					}
				}
			}
		}
		return Math.abs(fine);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(libraryFine(14,7,2018,5,7,2018));
//		System.out.println(libraryFine(9,6,2015,6,6,2015));
//		System.out.println(libraryFine(15, 7, 2014, 1, 7, 2015));
		System.out.println(libraryFine(28, 2, 2015, 15, 4, 2015));
	}

}
