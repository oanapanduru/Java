package hackerRankExercises;

public class SeparatetheNumbers {

    public static void separateNumbers(String s) {
        // Write your code here
        boolean isOk = false;
        for (int i = 0; i < s.length() / 2; i++) {
            isOk = true;
            long firstNumber = Long.parseLong(s.substring(0, i + 1));
//            System.out.println("firstNumber: " + firstNumber);
            String word = String.valueOf(firstNumber);
            long secondNumber = firstNumber;
            while(word.length() < s.length()) {
                secondNumber++;
//                System.out.println("secondNumber: " + secondNumber);
                word = word + secondNumber;
//                System.out.println("word: " + word);
                if (s.indexOf(word) != 0) {
                    isOk = false;
                    break;
                }
            }
            if(isOk) {
                System.out.println("YES " + firstNumber);
                break;
            }
        }
        if(!isOk) {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("10331003514757101033"));
        separateNumbers("10331003514757101033100351475711");
    }
}
