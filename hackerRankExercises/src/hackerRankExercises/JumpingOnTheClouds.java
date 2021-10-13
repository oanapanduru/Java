package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JumpingOnTheClouds {

//	TODO:https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
	public static int jumpingOnClouds(List<Integer> c) {
		// Write your code here
		int jumps = -1;
        for (int i = 0; i < c.size(); i++) {
            jumps++;
            if ((i + 2) < c.size() && c.get(i + 2) == 0) {
                i = i + 1;
            }
        }

        return jumps;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> c = new ArrayList<>();
//		0 0 1 0 0 1 0
//		Collections.addAll(c, 0,1,0,0,0,1,0);
//		0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,0,0,0
		Collections.addAll(c, 0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,0,0,0);
		System.out.println(jumpingOnClouds(c));
	}

}
