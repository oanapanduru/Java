package hackerRankExercises;

import java.util.*;

//https://www.hackerrank.com/challenges/manasa-and-stones/problem
public class ManasaAndStones {

    public static List<Integer> stones(int n, int a, int b) {
        Set<Integer> stones = new HashSet<>();
        stones.add(a);
        stones.add(b);
        int i = 0;
        while (i < n - 2) {
            Set<Integer> auxStones = new HashSet<>();
            for (Integer stone : stones) {
                int x = stone + a;
                int y = stone + b;
                auxStones.add(x);
                auxStones.add(y);
            }
            stones = auxStones;
            i++;
        }
        List<Integer> result = new ArrayList<Integer>(stones);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = stones(4, 10, 100);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
