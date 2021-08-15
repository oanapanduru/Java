package homeExercises;

import java.util.Arrays;

public class Intersection {

	//TODO:Given two arrays of ints a and b. Print the intersection of the arrays
	
	
	public static void intersection(int[]first, int[]second) {
		int count =0;
		for(int i=0; i<first.length; i++) {
			int element = first[i];
			for(int j=0; j<second.length; j++) {
				if(element==second[j]) {
					count++;
				}
			}
		}
		
		int[]result = new int[count];
		int idx=0;
		for(int i=0; i<first.length; i++) {
			int element = first[i];
			for(int j=0; j<second.length; j++) {		
				if(element==second[j]) {
					result[idx]= element;
					idx++;
				}
			}
		}
		
		System.out.println(Arrays.toString(result));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = new int[] { 1,2,3,4,5,6,7};
		int[] second = new int[] {3,4,8};
		intersection(first,second);
	}

}
