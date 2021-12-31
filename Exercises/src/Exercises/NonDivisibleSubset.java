package hackerRankExercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDivisibleSubset {

	// TODO:https://www.hackerrank.com/challenges/non-divisible-subset/problem

	public static int nonDivisibleSubset(int k, List<Integer> s) {

		ArrayList<ArrayList<Integer>> subsets = creatingSubsets(s);
//		for (int j = 0; j < subsets.size(); j++) {
//			System.out.println(subsets.get(j));
//		}

		int max = 0;
		Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		for (ArrayList<Integer> list : subsets) {
//			if (list.size() > 2) {
//				System.out.println("all lists"+list);
				boolean flag = true;
				for (int i = 0; i < list.size() - 1; i++) {
					for (int j = i + 1; j < list.size(); j++) {
						if ((list.get(i) + list.get(j)) % k == 0) {
//							set.add(list);
							flag = false;
							break;
//						System.out.println("added lists"+list);
						}
					}
					if (!flag) {
						break;
					}
				}
				if (flag) {
					if (max < list.size()) {
						max = list.size();
					}
				}
//			}
		}

		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(7);
		s.add(2);
		s.add(4);
		System.out.println(nonDivisibleSubset(3, s));
//		Collections.addAll(s, 278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436);
//		Collections.addAll(s, 1, 2, 3);
//		System.out.println(nonDivisibleSubset(3, s));
	}

	private static ArrayList<ArrayList<Integer>> creatingSubsets(List<Integer> array) {
		ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < array.size(); i++) {
//			System.out.println("STEP: " + i);
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();

			for (ArrayList<Integer> list : subsets) {
				temp.add(new ArrayList<Integer>(list));
			}
//			System.out.println("temp:" + temp);

			for (ArrayList<Integer> list : temp) {
				list.add(array.get(i));
			}
//			System.out.println("temp:"+temp);
			ArrayList<Integer> each = new ArrayList<Integer>();
			each.add(array.get(i));

			temp.add(each);
			subsets.addAll(temp);
//			System.out.println("result:"+subsets);
		}
		return subsets;
	}

}
