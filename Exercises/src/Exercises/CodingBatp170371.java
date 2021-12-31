package practice;
//https://codingbat.com/prob/p170371
public class CodingBatp170371 {
    public static int countX(String str) {
        int index = 0;
        if(index == str.length()) {
            return 0;
        } else {
            int count = 0;
            if(str.charAt(index) == 'x') {
                count++;
            }
            index++;
            return count + countX(str.substring(index));
        }
    }

    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
    }
}
