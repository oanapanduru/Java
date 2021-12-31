package practice;


import java.math.BigInteger;
import java.nio.ByteBuffer;

//https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
public class BinaryGap {

    public static int solution(int N) {
        int max = 0;
        String number = Integer.toBinaryString(N);
        System.out.println(number);
        for (int i = 0; i < number.length(); i++) {
            int count = 0;
            if (number.charAt(i) == '1') {
                while (i != number.length() - 1 && number.charAt(i + 1) == '0') {
                    count++;
                    i++;
                }
                if (i != number.length() - 1) {
                    if (count > max) {
                        max = count;
                    }
                }

            }
        }

        return max;
    }


    public static void main(String[] args) {
        System.out.println(solution(9));

    }
}

