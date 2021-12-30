package practice;

import java.util.*;

//https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
public class MissingInteger {

    public static int solution(int[] A) {
        int missing = 1;
        boolean allNegative = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                allNegative = false;
                break;
            }
        }
        if (allNegative) {
            return missing;
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < A.length; i++) {
                if (A[i] > 0) {
                    list.add(A[i]);
                }
            }
            Collections.sort(list);
            if (list.get(0) == 1) {
                if (list.size() == 1) {
                    missing = 2;
                } else {
                    for (int i = 0; i < list.size() - 1; i++) {
                        if (list.get(i + 1) - list.get(i) != 1 && !list.get(i + 1).equals(list.get(i))) {
                            missing = list.get(i) + 1;
                            break;
                        } else {
                            missing = list.get(list.size() - 1) + 1;
                        }
                    }

                }
            } else {
                return missing;
            }
        }


//        Arrays.sort(A);
//        if (A[A.length - 1] < 0) {
//            return missing;
//        } else {
//            if (A.length == 1) {
//                if (A[0] == 1) {
//                    missing = 2;
//                } else if (A[0] == 0) {
//                    missing = 1;
//                }
//            } else {
//                for (int i = 0; i < A.length - 1; i++) {
//                    if (A[i + 1] > 0 && A[i] > 0) {
//                        if (A[i + 1] - A[i] != 1 && A[i + 1] != A[i]) {
//                            missing = A[i] + 1;
//                            break;
//                        } else {
//                            if (A[0] == 1) {
//                                missing = A[A.length - 1] + 1;
//                            }
//                        }
//                    }
//
//                }
//            }
//        }
        return missing;
    }

    public static int solution2(int[] A) {
        int missing = 1;
        boolean allNegative = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                allNegative = false;
                break;
            }
        }
        if (allNegative) {
            return missing;
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < A.length; i++) {
                if (A[i] > 0) {
                    list.add(A[i]);
                }
            }
            Collections.sort(list);
            boolean missingDigit = false;
            for (int i = 1; i <= list.get(list.size() - 1); i++) {
                if (!list.contains(i)) {
                    missing = i;
                    missingDigit = true;
                    break;
                }
            }
            if (!missingDigit) {
                missing = list.get(list.size() - 1) + 1;
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] A = {2,2,1,1,2,3,3,5};
//        int[] A = {3, 2, 1, 4};
        System.out.println(solution(A));
        System.out.println(solution2(A));
        Integer a = new Integer(13450);
        Integer b = new Integer(13450);
        System.out.println(a != b);
        /*int[] A = new int[40000];
        int c = 4053;
        for (int i = 0; i < 40000; i++) {
            A[i] = i + 1 + c;
        }
        System.out.println(solution(A));*/
    }
}
