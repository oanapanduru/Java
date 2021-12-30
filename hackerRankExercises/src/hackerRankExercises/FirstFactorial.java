package practice;

import java.util.Scanner;

//https://coderbyte.com/editor/First%20Factorial:Java
public class FirstFactorial {
    public static int FirstFactorial(int num) {
        // code goes here
        int result = 1;
        int i = 1;
        while (i <= num) {
            result = result * i;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(FirstFactorial(s.nextLine()));
        System.out.println(FirstFactorial(4));
    }
}
