package practice;

import java.util.Scanner;

//https://coderbyte.com/editor/Longest%20Word:Java
public class LongestWord {
    public static String LongestWord(String sen) {
        // code goes here
        String result = "";
        String[] strings = sen.split(" ");
        int max = 0;
        String[] validStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            String word = "";
            for (int j = 0; j < currentString.length(); j++) {

                if (Character.isLetterOrDigit(currentString.charAt(j))) {
                    word = word + currentString.charAt(j);
                }

//                else {
//                    System.out.println(strings[i].charAt(j));
//                    validStrings[i] = currentString;
//                }
            }
            validStrings[i] = word;
        }
        for (int i = 0; i < validStrings.length; i++) {
            if(validStrings[i].length()>max){
                max = validStrings[i].length();
            }
        }
        for(int j=0; j< validStrings.length; j++){
            System.out.println("valids "+ validStrings[j]);
            if(validStrings[j].length()==max){
                result = validStrings[j];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}
