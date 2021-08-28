package hackerRankExercises;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {

	
	//TODO:https://www.hackerrank.com/challenges/circular-array-rotation/problem
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
    ArrayList<Integer> result = new ArrayList<Integer>();
    int step = 0;
    while(step<k) {
    	for(int i= a.size()-1; i>0; i--) {
    		int aux = a.get(i-1);
    		//a.get(i-1) = a.get(i);
    		a.set(i-1, a.get(i));
    		a.set(i,aux);
    	}
    	step++;
    }
    for(int i=0; i<queries.size(); i++) {
    	result.add(i, a.get(queries.get(i)));
    }
    return result;
    }
    
    public static List<Integer> circularArrayRotation2(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
    ArrayList<Integer> result = new ArrayList<Integer>();
    int step = 0;
    int r = k%a.size();
    while(step<r) {
    	for(int i= a.size()-1; i>0; i--) {
    		int aux = a.get(i-1);
    		//a.get(i-1) = a.get(i);
    		a.set(i-1, a.get(i));
    		a.set(i,aux);
    	}
    	step++;
    }
    for(int i=0; i<queries.size(); i++) {
    	result.add(i, a.get(queries.get(i)));
    }
    return result;
    }
    
    public static List<Integer> circularArrayRotation3(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
    ArrayList<Integer> result = new ArrayList<Integer>();
    
    ArrayList<Integer> cloned = new ArrayList<Integer>();
    cloned.addAll(a);
        for(int i= 0; i<a.size(); i++) {
           int j = (i+k)%a.size();
           cloned.set(j,a.get(i));
    }
    
    for(int i=0; i<queries.size(); i++) {
        result.add(i, cloned.get(queries.get(i)));
    }
    return result;
    }


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
