package practice;

//https://codingbat.com/prob/p163932
public class CodingBatp163932 {

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            int digit = n % 10;
            sum = sum + digit;
            return sum + sumDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(126));
    }
}
