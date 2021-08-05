package tests;

import java.util.ArrayList;
import java.util.List;

public class PrintNumberOfApplesAndOranges {

	

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    	// Write your code here
    	//The first line contains two space-separated integers denoting the respective values of s and t (start+ end of house).
    	//The second line contains two space-separated integers denoting the respective values of a and b.a = location of apple, b= location of orange
    	//The third line contains two space-separated integers denoting the respective values of m and n.
    	//The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a.
    	//The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.

    	int fallingApples = 0;
    	int fallingOranges =0;
    	for(int i=0; i < apples.size(); i++) {
    		if(apples.get(i)<=0) {
    			continue;
    		}
    		else {
    			if((a + apples.get(i)) >= s && (a+apples.get(i)) <=t) {
    				fallingApples++;
    			}
    		}
    	}
    	for(int i=0; i < oranges.size(); i++) {
    		if(oranges.get(i) >= 0) {
    			continue;
    		}
    		else {
    			//System.out.println((oranges.get(i)+b));
    			if((oranges.get(i)+b ) >= s && (oranges.get(i)+b ) <=t) {
    				fallingOranges++;
    			}
    		}
    	}
    	
    	
    	System.out.println(fallingApples);
    	System.out.println(fallingOranges);

    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> apples = new ArrayList<Integer>();
		apples.add(1);
		apples.add(-2);
		apples.add(3);
		List<Integer> oranges = new ArrayList<Integer>();
		oranges.add(1);
		oranges.add(-4);
		oranges.add(-3);
		//countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges)
		countApplesAndOranges(5, 7, 3, 9, apples, oranges);
	}

}
