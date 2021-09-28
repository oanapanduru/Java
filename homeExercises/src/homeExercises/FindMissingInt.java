package homeExercises;

import java.util.ArrayList;
import java.util.Collections;

public class FindMissingInt {

	public static int findMissingInt(ArrayList<Integer> input) {
		int missing = 0;
		boolean consecutive = true;
		int index =0;
		Collections.sort(input);
		for(int i=0; i<input.size()-1;i++) {
			if(input.get(i+1)-input.get(i)!=1) {
				consecutive = false;
				index = i;
				break;
			}
		}
		if(!consecutive) {
			missing = input.get(index)+1;
		}
		return missing;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(0);
		input.add(1);
		input.add(2);
		input.add(4);
		input.add(5);
		System.out.println(findMissingInt(input));
	}

}
