package hackerRankExercises;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/maximizing-xor/problem
public class MaximizingXOR {

    public static int maximizingXor(int l, int r) {

        int n = l - r;
        int max = 0;
        for (int a = l; a < r; a++) {
            for (int b = a; b <= r; b++) {
                int aux = a ^ b;
                if(aux > max) {
                    max = aux;
                }
            }
        }

        return max;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        scan.close();
        int result = maximizingXor(L, R);
        System.out.println(result);
    }

}
