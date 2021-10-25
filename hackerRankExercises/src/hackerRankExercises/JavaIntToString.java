package hackerRankExercises;

import java.util.Scanner;

//TODO:https://www.hackerrank.com/challenges/java-int-to-string/problem
public class JavaIntToString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
		int number = s.nextInt();
        String transformedToString = Integer.toString(number);
        System.out.println("Good job");
    }
}
