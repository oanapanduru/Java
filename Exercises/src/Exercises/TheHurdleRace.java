package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheHurdleRace {
	// TODO:https://www.hackerrank.com/challenges/the-hurdle-race/problem

	public static int hurdleRace(int k, List<Integer> height) {
		// Write your code here
		int doses = 0;
		int max = 0;
		for (int i : height) {
			if (i > max) {
				max = i;
			}
		}
		if (k >= max) {
			doses = 0;
		}
		else {
			doses = max-k;
		}
		return doses;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7
		//2 5 4 5 2
		List<Integer> a = new ArrayList<Integer>();
		Collections.addAll(a, 2, 5, 4, 5, 2);
		// Collections.addAll(a, 4, 6, 5, 3, 3, 1);
		System.out.println(hurdleRace(7,a));
	}

}
