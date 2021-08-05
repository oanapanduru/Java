package practice;

import java.util.ArrayList;

public class NumberOccurencies {
	public void numberOccurencies(int input[]) {
		ArrayList<Integer> occurencies = new ArrayList<Integer>();
		ArrayList<Integer> newNumbers = new ArrayList<Integer>();
		for (Integer i : input) {
			if (!newNumbers.contains(i)) {
				newNumbers.add(i);
				occurencies.add(1);
			} else {
				int index = newNumbers.indexOf(i);
				int value = occurencies.get(index);
				occurencies.set(index, value + 1);
			}
	}
	for (int j = 0; j < newNumbers.size(); j++) {
		System.out.println(newNumbers.get(j) + " occuring: " + occurencies.get(j));
	}
}
}

