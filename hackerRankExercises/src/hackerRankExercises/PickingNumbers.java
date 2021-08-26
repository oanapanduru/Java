package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

	// TODO:https://www.hackerrank.com/challenges/picking-numbers/problem
	public static int pickingNumbers(List<Integer> a) {
		// Write your code here

		ArrayList<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i) - a.get(j) <= 1) {
					// count++;
					// if (a.get(j) != a.get(j + 1) && j + 1 < a.size()) {
					// if(a.lastIndexOf(j)>-1) {
					count++;
					// }

				}
			}
			c.add(count);
		}
		int max = 0;
		for (int i : c) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 2 3 1 2
		// 4 6 5 3 3 1
		List<Integer> a = new ArrayList<Integer>();
		Collections.addAll(a, 1, 2, 2, 3, 1, 2);
		// Collections.addAll(a, 4, 6, 5, 3, 3, 1);
		System.out.println(pickingNumbers(a));
	}

}
