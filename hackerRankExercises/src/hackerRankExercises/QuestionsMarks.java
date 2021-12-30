package practice;


import java.sql.SQLOutput;
import java.util.*;

//https://coderbyte.com/editor/Questions%20Marks:Java
public class QuestionsMarks {
    public static String QuestionsMarks(String str) {
        // code goes here
        String result = "true";
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (!indexes.contains(i)) {
                    indexes.add(i);
                }
            }
        }
        boolean areSummed = false;
        for (int i = 0; i < indexes.size() - 1; i++) {
//            System.out.println(i);
            int countQuestionMarks = 0;
            int first = Integer.parseInt(String.valueOf(str.charAt(indexes.get(i))));
            int second = Integer.parseInt(String.valueOf(str.charAt(indexes.get(i + 1))));
            if (first + second == 10) {
                areSummed = true;
                String substring = str.substring(indexes.get(i), indexes.get(i + 1) + 1);
//                System.out.println(substring);
                for (int j = 0; j < substring.length  (); j++) {
                    if (substring.charAt(j) == '?') {
                        countQuestionMarks++;
                    }
                }
                if (countQuestionMarks < 3) {
                    result = "false";
                    break;
                }

            }
            i++;
        }
        if (!areSummed) {
            result = "false";
        }
        return result;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }
}
