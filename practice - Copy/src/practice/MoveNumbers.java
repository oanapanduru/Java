package practice;

import java.util.ArrayList;

public class MoveNumbers {
	public void moveNumbers(int input[]) {
		ArrayList<Integer> positive = new ArrayList<Integer>();
		ArrayList<Integer> negative = new ArrayList<Integer>();
		// ArrayList<Integer> result = new ArrayList<Integer>();
		for (Integer i : input) {
			if (i < 0) {
				negative.add(i);

			} else {
				positive.add(i);
			}
		}
		/*
		 * for (int j = 0; j < negative.size(); j++) { if
		 * (!result.contains(negative.get(j))) { result.add(negative.get(j)); }
		 * 
		 * } for (int j = 0; j < positive.size(); j++) { if
		 * (!result.contains(positive.get(j))) { result.add(positive.get(j)); }
		 * 
		 * }
		 */
		for (int j = 0; j < positive.size(); j++) {
			negative.add(positive.get(j));

		}
		System.out.print(negative);
	}

}
