package practice;

public class PassingCars {


    public static int solution(int[] A) {
        int east = 0;
        int west = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                east++;
            }
            if (A[i] == 1) {
                west = west + east;
            }
        }
        if (west > 1000000000 || west < 0) {
            return -1;
        }
        return west;
    }

    public static void main(String[] args) {
        int A[] = {0, 1, 0, 1, 1};
        System.out.println(solution(A));

    }
}
