package practice;

import java.util.Scanner;

//https://coderbyte.com/editor/Find%20Intersection:Java
public class FindIntersection {
    public static String FindIntersection(String[] strArr) {
        // code goes here
        String result = "";
        String[] firstStr = strArr[0].split(", ");
        String[] secondStr = strArr[1].split(", ");
        for (int i = 0; i < firstStr.length; i++) {
            for (int j = 0; j < secondStr.length; j++) {
                if (Integer.parseInt(firstStr[i]) == Integer.parseInt(secondStr[j])) {
                    result = result + firstStr[i] + ",";
                }
            }
        }
        if (result.isEmpty()) {
            result = "false";
        } else {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(FindIntersection(s.nextLine()));
//        String[] input = new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        String[] input = new String[]{"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
//        String[] input = new String[]{"1, 3, 4, 7, 13", "2, 15"};
        System.out.println(FindIntersection(input));
    }
}
