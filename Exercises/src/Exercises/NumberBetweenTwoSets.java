package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class NumberBetweenTwoSets {
	public static int getTotalX(List<Integer> a, List<Integer> b) {

		HashSet<Integer> lcm = new HashSet<Integer>();
		int start = a.get(a.size() - 1);
		int end = b.get(0);
		while (start <= end) {
			boolean isOk = true;
			for (int i = 0; i < a.size(); i++) {
				if (start % a.get(i) != 0) {
					isOk = false;
					break;
				}
			}
			for (int i = 0; i < b.size(); i++) {
				if (b.get(i) % start != 0) {
					isOk = false;
					break;
				}
			}
			if(isOk) {
				lcm.add(start);
			}
			start++;
		}
		/*
		 * // for (Integer i:lcm) { // System.out.println(i); // } List<Integer> list =
		 * new ArrayList<Integer>(lcm); Collections.sort(list); // for (int i = 0; i <
		 * list.size(); i++) { // System.out.println(list.get(i)); // } int count =
		 * list.size(); int startLcm = 0; int endLcm = list.size() - 1; while (startLcm
		 * <= endLcm) { boolean flag = true; for (int i = 0; i < b.size(); i++) { //
		 * for(int j = i+1; j<b.size(); j++) { if (b.get(i) % list.get(startLcm) != 0) {
		 * // && b.get(j)%list.get(startLcm)==0 flag = false; break;
		 * 
		 * } // } } if (!flag) { count--; } startLcm++; }
		 */
		return lcm.size();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		// a.add(8);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(16);
		b.add(32);
		b.add(96);
		System.out.println(getTotalX(a, b));
	}

}
