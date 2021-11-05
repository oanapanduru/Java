package hackerRankExercises;

//https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
public class HackerRankInAString {
    public static String hackerrankInString(String s) {
        // Write your code here
        String response = "";
        String toBeMatched = "hackerrank";
        if (s.length() < toBeMatched.length()) {
            return "NO";
        }

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (toBeMatched.charAt(j) == s.charAt(i)) {
                j++;
            }
            if (j == toBeMatched.length()) {
                return "YES";
            }
        }
        return "NO";

    }

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereiamstackerrank"));
    }
}
