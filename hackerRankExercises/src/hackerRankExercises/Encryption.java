package hackerRankExercises;

import java.sql.SQLOutput;

//https://www.hackerrank.com/challenges/encryption/problem
public class Encryption {

    public static String encryption(String s) {
        // Write your code here
        String result = "";
        String withoutEmptySpaces = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                withoutEmptySpaces = withoutEmptySpaces + s.charAt(i);
            }
        }
//        System.out.println(withoutEmptySpaces);
        int len = withoutEmptySpaces.length();
//        System.out.println(len);
        int rows = (int) Math.floor(Math.sqrt(len));
        int columns = (int) Math.ceil(Math.sqrt(len));
        if (rows * columns < len) {
            rows++;
        }
        char[][] matrix = new char[rows][columns];
        String[] strings = new String[rows];
        boolean fits = true;
        for (int k = 0; k < strings.length; k++) {
            if ((k + 1) * columns > len) {
                strings[k] = withoutEmptySpaces.substring(k * columns, ((k + 1) * columns) - ((rows * columns) - len));
            } else {
                strings[k] = withoutEmptySpaces.substring(k * columns, (k + 1) * columns);
            }
        }

//        for (String strgs : strings) {
//            System.out.println(strgs);
//        }


//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println();
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i].length > strings[i].length()) {
//                    int stop = strings[i].length();
//                    for (int k = 0; k < stop; k++) {
//                        matrix[i][k] = strings[i].charAt(k);
//                    }
//
//                } else {
//                    matrix[i][j] = strings[i].charAt(j);
//                }
//
//                System.out.print(matrix[i][j]);
//            }
//        }


        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                if (strings[j].length() > i) {
                    result = result + strings[j].charAt(i);
                }

//                System.out.print(strings[j].charAt(i));

            }
            result = result + " ";
//            System.out.print(" ");
//            System.out.println();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(encryption("if man was meant to stay on the ground god would have given us roots"));
    }
}
