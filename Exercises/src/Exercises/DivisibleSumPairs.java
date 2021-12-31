package hackerRankExercises;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int count = 0;
		int sum = 0;
		for(int i=0; i<ar.size()-1;i++) {
			for(int j = i+1;j<ar.size(); j++) {
				 sum=  ar.get(i)+ar.get(j);
				 if(sum%k ==0) {
						count++;
					}
			}
			
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(3);
		ar.add(2);
		ar.add(6);
		ar.add(1);
		ar.add(2);
		System.out.println(divisibleSumPairs(6,3,ar));
	}

}
