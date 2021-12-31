package hackerRankExercises;

//https://www.hackerrank.com/challenges/mars-exploration/problem
public class MarsExploration {
    public static int marsExploration(String s) {
        // Write your code here
        int altered = 0;
        for (int i = 0; i < s.length(); i += 3) {
            if (s.charAt(i) != 'S') {
                altered++;
            }
            if (s.charAt(i + 1) != 'O') {
                altered++;
            }
            if (s.charAt(i + 2) != 'S') {
                altered++;
            }
        }
        return altered;
    }

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
    }
}
