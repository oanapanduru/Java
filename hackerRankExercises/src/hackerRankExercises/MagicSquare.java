package hackerRankExercises;

import java.util.ArrayList;
import java.util.List;

public class MagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> s = new ArrayList<List<Integer>>();
		s.add(new ArrayList<Integer>());
		s.add(new ArrayList<Integer>());
		s.add(new ArrayList<Integer>());
		s.get(0).add(5);
		s.get(0).add(3);
		s.get(0).add(4);
		s.get(1).add(1);
		s.get(1).add(5);
		s.get(1).add(8);
		s.get(2).add(6);
		s.get(2).add(4);
		s.get(2).add(2);
		formingMagicSquare(s);
	}

	public static int formingMagicSquare(List<List<Integer>> s) {
		int[][][] ms = { 
				{ { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } }, 
				{ { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
				{ { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } }, 
				{ { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
				{ { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } }, 
				{ { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
				{ { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } }, 
				{ { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } }, 
				};

		int minCost = 81;
		for (int k = 0; k < ms.length; k++) {
			int cost = 0;
			int[][] thisM = ms[k];
			for (int i = 0; i < s.size(); i++) {
				for (int j = 0; j < s.size(); j++) {
					cost = cost + Math.abs(s.get(i).get(j) - thisM[i][j]);
				}
			}
			if(cost < minCost) {
				minCost = cost;
			}
		}
		System.out.println(minCost);
		return Math.abs(minCost);
	}

}
