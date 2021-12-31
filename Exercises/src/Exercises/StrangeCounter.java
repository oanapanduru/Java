package hackerRankExercises;
//https://www.hackerrank.com/challenges/strange-code/problem
public class StrangeCounter {

    public static long strangeCounter(long t) {
        // Write your code here
        long second = 0L;
        long roundNo = (long)(Math.log( (t+2)/3 ) / Math.log(2)) + 1;
        long time = 3L * (long)Math.pow( 2,roundNo-1 ) - 2;
        long value = time + 2;
        second= (value) - (t - time);
        return second;

    }

    public static void main(String[] args) {
        System.out.println(strangeCounter(17));
    }
}
