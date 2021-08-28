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
	    int magicSum = 45;
	    int costLine = 0;
	    int costCol = 0;
	    int cost = 0;
	    for(int i = 0; i < s.size(); i++) {
	    	int lineSum = 0;
	    	int colSum = 0;
	    	for(int j = 0; j < s.size(); j++) {
	    		lineSum = lineSum + s.get(i).get(j);
	    		colSum = colSum + s.get(j).get(i);
	    	}
	    	//System.out.println("Sum of line " + i + ": " + lineSum);
	    	//System.out.println("Sum of col " + i + ": " + colSum);
	    	costLine = costLine + Math.abs(lineSum - 15);
	    	costCol = costCol + Math.abs(colSum - 15);
	    	cost = cost + (15 - costLine) + (15 - costCol);
	    }
		return Math.abs(cost);
	}
	

}
