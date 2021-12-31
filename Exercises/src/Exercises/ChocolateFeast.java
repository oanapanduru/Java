package hackerRankExercises;

//https://www.hackerrank.com/challenges/chocolate-feast/problem
public class ChocolateFeast {
    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        int divisionResult = 0;
        int reminder = 0;
        int bars = n / c;
        int wrappers = bars;
        while (wrappers >= m) {
            divisionResult = wrappers / m;
            bars = bars + divisionResult;
            reminder = wrappers % m;
            wrappers = reminder + divisionResult;
        }
        return bars;
    }

    public static void main(String[] args) {
        System.out.println(chocolateFeast(15, 3, 2));
    }
}
