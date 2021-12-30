package practice;

public class ArrListLen {

    public static int solution(int[] A) {
        int count = 1;
        int i = 0;
        while (A[i] != -1) {
            count++;
            i = A[i];
        }
        return count;

    }

    public static void main(String[] args) {
        int[] A = {1, 4, -1, 3, 2};
        System.out.println(solution(A));
    }
}
