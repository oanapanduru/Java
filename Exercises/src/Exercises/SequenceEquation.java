package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequenceEquation {

	// TODO:https://www.hackerrank.com/challenges/permutation-equation/problem
	public static List<Integer> permutationEquation(List<Integer> p) {
		// Write your code here
		ArrayList<Integer> result = new ArrayList<Integer>();
		int idx = 0;
		for (int i = 0; i < p.size(); i++) {
			int auxIdx1 = 0;
			int auxIdx2 = 0;
			int x = i + 1;
			for (int j = 0; j < p.size(); j++) {
				if (p.get(j) == x) {
					auxIdx1 = j + 1;
				}
			}
			for (int j = 0; j < p.size(); j++) {
				if (p.get(j) == auxIdx1) {
					auxIdx2 = j + 1;
				}
			}
			result.add(auxIdx2);
		}
		for (Integer i : result) {
			System.out.print(i + " ");
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		Collections.addAll(l, 5, 2, 1, 3, 4);
		permutationEquation(l);
	}

}
