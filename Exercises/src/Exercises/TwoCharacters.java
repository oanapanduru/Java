package hackerRankExercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://www.hackerrank.com/challenges/two-characters/problem
public class TwoCharacters {
    public static int alternate(String s) {
        // Write your code here
        int result = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        List<Character> list = new ArrayList<>(set);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                StringBuilder sb = new StringBuilder();
                char letter1 = list.get(i);
                char letter2 = list.get(j);
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == letter1 || s.charAt(k) == letter2) {
                        sb.append(s.charAt(k));
                    }
                }
                boolean validString = true;
                for (int l = 0; l < sb.length() - 1; l++) {
                    if (sb.charAt(l) == sb.charAt(l + 1)) {
                        validString = false;
                    }
                }
                if (validString) {
                    if (sb.length() > result) {
                        result = sb.length();
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(alternate("beabeefeab"));
    }
}
