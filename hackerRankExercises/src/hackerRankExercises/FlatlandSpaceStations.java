package hackerRankExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.hackerrank.com/challenges/flatland-space-stations/problem?h_r=next-challenge&h_v=legacy
public class FlatlandSpaceStations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);
        int spaceStations[] = new int[0];
        spaceStations = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(spaceStations);
        int max = spaceStations[0];
        if(n - 1 - spaceStations[m-1] > max) {
            max = n - 1 - spaceStations[m-1];
        }
        for (int i = 0; i < m - 1; i++) {
            int currMax = (spaceStations[i+1] - spaceStations[i]) / 2;
            if(currMax > max) {
                max = currMax;
            }
        }
        System.out.println(max);

    }


}
