package practice;

import java.util.Scanner;

//https://coderbyte.com/editor/First%20Reverse:Java
public class FirstReverse {
    public static String FirstReverse(String str) {
        // code goes here
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            result = result+str.charAt(i);
        }
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }
}
