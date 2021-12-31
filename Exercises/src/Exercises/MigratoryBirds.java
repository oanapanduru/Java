package hackerRankExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {
	// https://www.hackerrank.com/challenges/migratory-birds/problem

	public static int migratoryBirds(List<Integer> arr) {
		int type = 0;

		/*
		 * List<Integer> carr = new ArrayList<Integer>(); for (int i = 0; i <
		 * arr.size(); i++) { carr.add(null); }
		 * 
		 * for (int i = 0; i < arr.size(); i++) { int bird = arr.get(i); if
		 * (carr.get(bird) == null) { carr.set(bird, 1); } else { carr.set(bird,
		 * carr.get(bird) + 1); } } for (int i = 0; i < carr.size(); i++) {
		 * System.out.print(carr.get(i) + " "); }
		 */

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.size(); i++) {
			int bird = arr.get(i);
			if (!map.containsKey(bird)) {
				map.put(bird, 1);
			} else {
				map.put(bird, map.get(bird) + 1);
			}
		}
		int max = 0;
		int maxVal = 0;
		for (Integer key : map.keySet()) {
			// System.out.println(map.get(key));
			if (map.get(key) > max) {
				max = map.get(key);
				maxVal = max;
			}
		}
		int min = arr.size();
		for (Integer key : map.keySet()) {
			if (map.get(key) == maxVal) {
				if (key < min) {
					min = key;
					type = key;
				}
			}
		}
		// System.out.println(maxVal);

		return type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		System.out.println(migratoryBirds(arr));
	}

}
