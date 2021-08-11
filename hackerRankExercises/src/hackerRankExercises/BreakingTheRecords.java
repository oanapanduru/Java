package hackerRankExercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BreakingTheRecords {
	// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

	public static List<Integer> breakingRecords(List<Integer> scores) {
		ArrayList<Integer> breakingRecords = new ArrayList<Integer>();
		int max = scores.get(0);
		int min = scores.get(0);
		int countBreakMax = 0;
		int countBreakMin = 0;
		for(int i =0; i<scores.size(); i++) {
			if(scores.get(i)>max) {
				max = scores.get(i);
				countBreakMax++;
			}
			if(scores.get(i)<min) {
				min = scores.get(i);
				countBreakMin++;
			}
		}

		breakingRecords.add(countBreakMax);
		breakingRecords.add(countBreakMin);
		return breakingRecords;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> scores = new ArrayList<Integer>();
		//10 5 20 20 4 5 2 25 1
		scores.add(10);
		scores.add(5);
		scores.add(20);
		scores.add(20);
		scores.add(4);
		scores.add(5);
		scores.add(2);
		scores.add(25);
		scores.add(1);
		System.out.println(breakingRecords(scores));
	}

}
