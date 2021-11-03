package hackerRankExercises;

//https://www.hackerrank.com/challenges/caesar-cipher-1/problem
public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        // Write your code here
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] shifted = new char[alphabet.length];
        int diffK = 0;
        if (k > alphabet.length) {
            diffK = k % alphabet.length;
        } else {
            diffK = k;
        }
        for (int i = 0; i < shifted.length; i++) {
            if (i + diffK <= alphabet.length - 1) {
                shifted[i] = alphabet[i + diffK];
            } else {
                int idx = (((i + diffK) - i) - ((alphabet.length - 1) - i)) - 1;
                shifted[i] = alphabet[idx];
            }
        }
//        for (int i = 0; i < shifted.length; i++) {
//            System.out.print(shifted[i] + " ");
//        }
//        System.out.println(shifted[24]);
        char[] initialString = s.toCharArray();
        char[] encryptedString = new char[initialString.length];
        for (int i = 0; i < initialString.length; i++) {
            int idx = 0;
            if (Character.isAlphabetic(initialString[i])) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (Character.toLowerCase(initialString[i]) == Character.toLowerCase(alphabet[j])) {
                        idx = j;
                    }
                }
                if (initialString[i] == Character.toUpperCase(initialString[i])) {
                    encryptedString[i] = Character.toUpperCase(shifted[idx]);
                } else {
                    encryptedString[i] = shifted[idx];
                }
            } else {
                encryptedString[i] = initialString[i];
            }

        }

        return String.valueOf(encryptedString);
    }


    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
    }
}
