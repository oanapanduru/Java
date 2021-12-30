package practice;

//https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
public class TapeEquilibrium {
    public static int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int sum1 = 0;

        for (int i = 0; i < A.length - 1; i++) {
            sum1 = sum1 + A[i];
            int sum2 = 0;
            for (int j = i + 1; j < A.length; j++) {
                sum2 = sum2 + A[j];
//                System.out.println(substring + " " + substring2);
            }
            int diff = Math.abs(sum1 - sum2);
            if (diff < min) {
                min = diff;
            }
//            System.out.println(substring + " " + substring2);
        }

        return min;
    }

    public static void main(String[] args) {
        int[] A = {3,1,2,4,3};
        System.out.println(solution(A));
    }
}
