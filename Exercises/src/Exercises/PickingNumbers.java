package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

	// TODO:https://www.hackerrank.com/challenges/picking-numbers/problem
	public static int pickingNumbers(List<Integer> a) {
		// Write your code here

		int maxCount = 0;
		for (int i = 0; i < a.size(); i++) {
			List<Integer> sublist = new ArrayList<Integer>();
			sublist.add(a.get(i));
			for (int j = 0; j < a.size(); j++) {
				if (i != j) {
					int newEl = a.get(j);
					boolean elig = true;
					for (int k = 0; k < sublist.size(); k++) {
						if (Math.abs(newEl - sublist.get(k)) > 1) {
							elig = false;
							break;
						}
					}
					if (elig) {
						sublist.add(newEl);
					}
				}
			}
			if (sublist.size() > maxCount) {
				maxCount = sublist.size();
				for (int k = 0; k < sublist.size(); k++) {
					System.out.print(sublist.get(k) + " ");
				}
				System.out.println();
			}
		}
		return maxCount;
	}
	
	public static int pickingNumbers2(List<Integer> a) {
		// Write your code here

		Collections.sort(a);
		
		int maxCount = 0;
		for (int i = 0; i < a.size() - 1; i++) {
			int count = 1;
			int j = i + 1;
			while(j < a.size() && Math.abs(a.get(j) - a.get(i)) <= 1) {
				count++;
				j++;
			}
			if(count > maxCount) {
				maxCount = count;
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 2 3 1 2
		// 4 6 5 3 3 1
		List<Integer> a = new ArrayList<Integer>();
//		Collections.addAll(a, 1, 2, 2, 3, 1, 2);
		Collections.addAll(a, 4, 6, 5, 3, 3, 1);
		System.out.println(pickingNumbers2(a));
	}

}
