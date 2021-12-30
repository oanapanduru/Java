package practice;

import java.util.Arrays;

//https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
public class PermMissingElem {
    public static int solution(int[] A) {
        int result = 1;
        Arrays.sort(A);
        boolean missing = false;

        if (A.length >= 1) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i + 1] - A[i] != 1) {
                    int element = 0;
//                result = A[i] + 1;
                    element = A[i] + 1;
                    result = element;
                    missing = true;
                    break;
                }
            }
            if (missing) {
                return result;
            } else {
                if (A[0] != 1) {
                    result = 1;
                } else {
                    result = A[A.length - 1] + 1;
                }
                return result;
            }
        }
//        return result;
        else {
            return result;
        }
    }

    public static void main(String[] args) {
        int[] A = {};
        System.out.println(solution(A));
    }
}
