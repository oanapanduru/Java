package hackerRankExercises;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/funny-string/problem
public class FunnyString {

    public static String funnyString(String s) {
        // Write your code here
        String result = "Funny";
        String sReversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sReversed = sReversed + s.charAt(i);
        }
        List<Integer> differencesS = new ArrayList<>();
        List<Integer> differencesSReversed = new ArrayList<>();
        for (int j = 0; j < s.length() - 1; j++) {
            int diffS = Math.abs(s.charAt(j) - s.charAt(j + 1));
            differencesS.add(diffS);
            int diffSreversed = Math.abs(sReversed.charAt(j) - sReversed.charAt(j + 1));
            differencesSReversed.add(diffSreversed);
        }
        for(int k=0; k<differencesS.size(); k++){
            if(differencesS.get(k)!=differencesSReversed.get(k)){
                result = "Not Funny";
                break;
            }
//            System.out.println(diff);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(funnyString("bcxz"));
    }
}
