package hackerRankExercises;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class ACMICPCTeam {

	public static List<Integer> acmTeam(List<String> topic) {
		// Write your code here
		int max=0;
		int maxFreq=0;
		List<Integer> scores = new ArrayList<>();
		for (int i = 0; i < topic.size() - 1; i++) {
			for (int j = i+1; j < topic.size(); j++) {
				BitSet result = new BitSet(topic.get(0).length());
				for (int k = 0; k < topic.get(0).length(); k++) {
					byte bit1=0;
					byte bit2=0;
					if(topic.get(i).charAt(k)=='1') {
						bit1=1;
					}
					if(topic.get(j).charAt(k)=='1') {
						bit2=1;
					}
					if((bit1 | bit2)==1) {
						result.set(k);
					}
					
				}
				int cardinality = result.cardinality();
				if(cardinality>max) {
					max = cardinality;
					maxFreq = 1;
				}
				else if(cardinality==max){
					maxFreq++;
				}
				
			}
		}
		scores.add(max);
		scores.add(maxFreq);
		return scores;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> topic = new ArrayList<>();
//		10101
//		11110
//		00010
		Collections.addAll(topic,"10101", "11110","00010");
		System.out.println( acmTeam(topic));
	}

}
