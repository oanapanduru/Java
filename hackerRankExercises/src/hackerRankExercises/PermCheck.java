package practice;

import java.util.*;

//https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
public class PermCheck {

    public static int solution(int[] A) {
        int result = 0;
        int max = 0;
        boolean valid = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                valid = false;
                break;
            }
        }
        if (valid) {
            for (int i = 1; i <= max; i++) {
                if (!map.containsKey(i)) {
                    result = 0;
                    break;
                } else {
                    result = 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 3, 2};
        System.out.println(solution(A));
    }

}
