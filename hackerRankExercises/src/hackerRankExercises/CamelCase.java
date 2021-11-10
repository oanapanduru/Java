package hackerRankExercises;

public class CamelCase {

    public static int camelcase(String s) {
        // Write your code here
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == Character.toUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
