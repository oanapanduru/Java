package hackerRankExercises;

// https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
public class TheLoveLetterMystery {

    public static int theLoveLetterMystery(String s) {
        // Write your code here
        int result = 0;
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                result = result + Math.abs(s.charAt(i) - s.charAt(j));
            }
            i++;
            j--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abcd"));
    }
}
