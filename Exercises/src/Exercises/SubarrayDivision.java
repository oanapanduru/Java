package hackerRankExercises;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
	// https://www.hackerrank.com/challenges/the-birthday-bar/problem

	public static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		int i = 0;
		if (s.size() == 1 && s.get(0) == d) {
			count = 1;
		} else {
			while (i < s.size()-m+1) {
				int sum = s.get(i);
				for (int j = i + 1; j < i + m; j++) {
					sum = sum + s.get(j);
				}
				if (sum == d) {
					count++;
				}
				
				i++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		System.out.println(birthday(s, 2, 3));
	}

}
