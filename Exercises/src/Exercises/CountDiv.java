package practice;

public class CountDiv {

    public static int solution(int A, int B, int K) {
        int count = 0;
        int divA = (int) Math.floor(A / K);
        int divB = (int) Math.floor(B / K);
        int firstIs = 0;
        if (A % K == 0) {
            firstIs = 1;
        }
        count = divB - divA + firstIs;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, 11, 2));
    }
}
