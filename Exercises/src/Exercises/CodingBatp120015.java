package practice;

//https://codingbat.com/prob/p120015
public class CodingBatp120015 {
    public static int fibonacci(int n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
