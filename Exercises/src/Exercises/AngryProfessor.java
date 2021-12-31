package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AngryProfessor {
	// TODO:https://www.hackerrank.com/challenges/angry-professor/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

	public static String angryProfessor(int k, List<Integer> a) {
		// Write your code here
		String result = "";
		int countOnTime = 0;
		for(int i:a) {
			if(i<=0) {
				countOnTime++;
			}
		}
		if(countOnTime>=k) {
			result = "NO";
		}
		else {
			result = "YES";
		}
			
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-1 -3 4 2
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, -1, -3, 4 ,2);
		System.out.println(angryProfessor(3, list));
	}

}
