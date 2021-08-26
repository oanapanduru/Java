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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String lines;
		try {
			for (int i = 0; i < queries; i++) {
				lines = br.readLine();
				String[] strs = lines.trim().split("\\s+");
				int catA = Integer.parseInt(strs[0]);
				int catB = Integer.parseInt(strs[1]);
				int mouse = Integer.parseInt(strs[2]);
				int distanceCatA = Math.abs(mouse-catA); 
			//	System.out.println("distanceCatA " + distanceCatA);
				int distanceCatB = Math.abs(mouse-catB);
			//	System.out.println("distanceCatB " +distanceCatB);
				if(distanceCatA>distanceCatB) {
					System.out.println("Cat B");
				}
				else if(distanceCatB>distanceCatA) {
					System.out.println("Cat A");
				}
				//if(distanceCatB==distanceCatA) {
				else {
					System.out.println("Mouse C");
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
