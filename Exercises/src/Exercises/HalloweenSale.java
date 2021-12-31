package hackerRankExercises;
//https://www.hackerrank.com/challenges/halloween-sale/problem
public class HalloweenSale {
    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count = 0;
        int cost = 0;
        while (p > m  && s >= cost+p) {
            cost = cost + p;
            count++;
            p = p - d;
        }
        if(p <= m) {
            p = m;
            while (s >= cost + p) {
                cost = cost + p;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(100, 12, 55, 95));
//        System.out.println(howManyGames(10, 1, 2, 20));
//        System.out.println(howManyGames(61, 87, 31, 9702));
//        System.out.println(howManyGames(20, 3, 6, 70));
    }
}