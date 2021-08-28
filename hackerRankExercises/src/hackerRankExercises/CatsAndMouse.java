package hackerRankExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CatsAndMouse {

	// TODO:https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        int[][] inputs = new int[queries][3];
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String lines;

        try {
            for (int i = 0; i < queries; i++) {
                //lines = in.nextLine();
                //String[] strs = lines.trim().split("\\s+");
                int catA = in.nextInt();
                int catB = in.nextInt();
                int mouse = in.nextInt();
                inputs[i][0] = catA;
                inputs[i][1] = catB;
                inputs[i][2] = mouse;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i < queries; i++) {
            int distanceCatA = Math.abs(inputs[i][2] - inputs[i][0]);
            // System.out.println("distanceCatA " + distanceCatA);
            int distanceCatB = Math.abs(inputs[i][2] - inputs[i][1]);
            // System.out.println("distanceCatB " +distanceCatB);
            if (distanceCatA > distanceCatB) {
                System.out.println("Cat B");
            } else if (distanceCatB > distanceCatA) {
                System.out.println("Cat A");
            }
            // if(distanceCatB==distanceCatA) {
            else {
                System.out.println("Mouse C");
            }
        }
	}

}
