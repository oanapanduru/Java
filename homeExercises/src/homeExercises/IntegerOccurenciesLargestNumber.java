package homeExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntegerOccurenciesLargestNumber {

	//TODO:Given an array of ints arr. Find the number with the most occurrences. 
	//If more than one number has the most number of occurrences print the largest number.
	
	public static void integerOccurencies(int[]arr) {
		int[]occ = new int[arr.length];
		for(int i =0; i<arr.length; i++) {
			int k = arr[i];
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==k) {
					count++;
				}
			}
			occ[i]=count;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(occ));
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i<arr.length; i++) {
			int k  = arr[i];
			if(!map.containsKey(k)) {
				map.put(k, occ[i]);
			}
		}
		int max =0;
		for(int i:map.keySet()) {
			if(map.get(i)>max) {
				max = map.get(i);
			}
		}
		//System.out.println(max);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i:map.keySet()) {
			if(map.get(i)==max) {
				list.add(i);
			}
		}
		int maximum =0;
		for(int i:list) {
			if(i>maximum) {
				maximum=i;
			}
		}
		System.out.println(maximum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 3, 1, 5, 6, 1, 0, 0, 0 };
		integerOccurencies(arr);
	}

}
