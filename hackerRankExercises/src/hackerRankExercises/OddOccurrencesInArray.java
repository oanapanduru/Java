package practice;

import java.util.HashMap;
import java.util.Map;

//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        int odd = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) % 2 != 0) {
                odd = i;
                break;
            }
        }
        return odd;

    }

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(A));
    }
}
