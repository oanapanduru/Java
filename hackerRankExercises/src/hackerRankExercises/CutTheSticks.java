package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {

	// TODO:https://www.hackerrank.com/challenges/cut-the-sticks/problem
	public static List<Integer> cutTheSticks(List<Integer> arr) {
		// Write your code here
		Collections.sort(arr);
		List<Integer> counts = new ArrayList<Integer>();
		while (arr.size() > 0) {
			counts.add(arr.size());
			int min = arr.get(0);
			
			for (int i = 0; i < arr.size(); i++) {
				arr.set(i, arr.get(i) - min);
			}
			for (Integer i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			while(arr.size() > 0 && arr.get(0)==0) {
				arr.remove(0);
			}
			

		}
		for (Integer i : counts) {
			System.out.println("the sizes: " + i);
		}
		return counts;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(4);
		arr.add(4);
		arr.add(2);
		arr.add(2);
		arr.add(8);
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);

		System.out.println(cutTheSticks(arr));
	}

}
