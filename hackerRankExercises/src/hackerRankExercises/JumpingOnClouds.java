package hackerRankExercises;

import java.util.Scanner;

public class JumpingOnClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int i = 0; i < n; i++) {
        	c[i] = in.nextInt();
        }
        int e = 100;
//        int currentCloud = 0;
        boolean hasFinished = false;
//        while(!hasFinished) {
        for(int currentCloud = 0; !hasFinished;) {
        	e--;
        	currentCloud = (currentCloud + k) % n;
        	if(c[currentCloud] == 1) {
        		e = e - 2;
        	}
        	if(currentCloud == 0) {
        		hasFinished = true;
        	}
        }
        System.out.println(e);

	}

}
