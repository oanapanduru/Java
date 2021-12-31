package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {

//	TODO:https://www.hackerrank.com/challenges/equality-in-a-array/problem
	public static int equalizeArray(List<Integer> arr) {
		// Write your code here
		int deletions = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.size(); i++) {
			if (!map.containsKey(arr.get(i))) {
				map.put(arr.get(i), 1);
			} else {
				map.put(arr.get(i), map.get(arr.get(i)) + 1);
			}
		}
		int max = 0;
		for (Integer key : map.keySet()) {
//			System.out.println(key + " " + map.get(key));
			if (map.get(key) > max) {
				max = map.get(key);
			}
		}
		for (Integer key : map.keySet()) {
				deletions = deletions + map.get(key);	
		}
		return deletions-max;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> c = new ArrayList<>();
//		10 27 9 10 100 38 30 32 45 29 27 29 32 38 32 38 14 38 29 30 63 29 63 91 54 10 63
//		Collections.addAll(c, 1, 2, 2, 3);
		Collections.addAll(c, 10, 27, 9, 10, 100, 38, 30, 32, 45, 29, 27, 29, 32, 38, 32, 38, 14, 38, 29, 30, 63, 29,
				63, 91, 54, 10, 63);
		System.out.println(equalizeArray(c));
	}

}
