package hackerRankExercises;

import java.util.ArrayList;
import java.util.List;

public class NonDivisibleSubset2 {

	public static int nonDivisibleSubset(int k, List<Integer> s) {
		int count = 0;
		List<Integer>remainders = new ArrayList<Integer>();
		for(Integer each:s) {
			remainders.add(each%k);
		}
		int[]frequencies = new int[k];
		for(int i=0; i<remainders.size();i++) {
			frequencies[remainders.get(i)]++;
			
		}
//		for(int j=0; j<frequencies.length;j++) {
//			System.out.println(frequencies[j]);
//		}
		if(frequencies[0]>0) {
			count++;
		}
		for(int i=1; i<=k-i;i++) {
			if(i==k-i) {
				if(frequencies[i]>0) {
					count++;
				}
			}
			else {
				count+=Math.max(frequencies[i], frequencies[k-i]);
			}
		}
		return count;
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

}
