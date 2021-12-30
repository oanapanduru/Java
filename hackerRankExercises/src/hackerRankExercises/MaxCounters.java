package practice;

//https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
public class MaxCounters {

    public static int[] solution2(int N, int[] A) {
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = 0;
        }
        for (int i = 0; i < A.length; i++) {
            int currIndx = A[i] - 1;
            if (currIndx < N) {
                int currValue = result[currIndx];
                result[currIndx] = currValue + 1;
            } else if (currIndx >= N) {
                int max = 0;
                for (int j = 0; j < result.length; j++) {
                    if (result[j] > max) {
                        max = result[j];
                    }
                }
                for (int k = 0; k < result.length; k++) {
                    result[k] = max;
                }
            }
        }
        return result;
    }

    public static int[] solution(int N, int[] A) {
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = 0;
        }
        int max = 0;
        int lastMax = 0;
        for (int i = 0; i < A.length; i++) {
            int currIndx = A[i] - 1;
            if (currIndx < N) {
                if (result[currIndx] < lastMax) {
                    result[currIndx] = lastMax;
                }
                int currValue = result[currIndx];
                result[currIndx] = currValue + 1;
                if (result[currIndx] > max) {
                    max = result[currIndx];
                }
            } else if (currIndx >= N) {
                lastMax = max;
            }
        }
        for (int k = 0; k < result.length; k++) {
            if (result[k] < lastMax) {
                result[k] = lastMax;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] result = solution(5, A);
        for (Integer i : result) {
            System.out.print(i + " ");
        }

    }
}
