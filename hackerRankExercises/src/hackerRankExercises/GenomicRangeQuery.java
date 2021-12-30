package practice;

import java.util.ArrayList;
import java.util.List;

public class GenomicRangeQuery {

    public static int[] solution(String S, int[] P, int[] Q) {
        int impactA = 1;
        int impactC = 2;
        int impactG = 3;
        int impactT = 4;
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            String substring = S.substring(P[i], Q[i] + 1);
            int min = 5;
            for (int j = 0; j < substring.length(); j++) {
                int impact = 0;
                if (substring.charAt(j) == 'A') {
                    impact = impactA;
                } else if (substring.charAt(j) == 'C') {
                    impact = impactC;
                } else if (substring.charAt(j) == 'G') {
                    impact = impactG;
                } else if (substring.charAt(j) == 'T') {
                    impact = impactT;
                }
                if (impact < min) {
                    min = impact;
                }
            }
           result[i]=min;

        }
        return result;
    }

    public static void main(String[] args) {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] result = solution(S, P, Q);
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }
}
