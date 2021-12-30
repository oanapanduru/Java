package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
public class FrogRiverOne {
    public static int solution2(int X, int[] A) {
        int result = -1;
        int[] freq = new int[X + 1];

        for (int i = 0; i < A.length; i++) {
            boolean flag = true;
            freq[A[i]]++;
            for (int j = 1; j < freq.length; j++) {
                if (freq[j] == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static int solution(int X, int[] A) {
        int result = -1;
        Set<Integer> list = new HashSet<>();
        for (int i = 1; i <= X; i++) {
            list.add(i);
        }


        for (int i = 0; i < A.length; i++) {
            if (list.contains(A[i])) {
                list.remove(A[i]);
            }

            if (list.isEmpty()) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5};
        System.out.println(solution(5, A));
    }
}


