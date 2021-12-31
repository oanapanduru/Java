package hackerRankExercises;

//https://www.hackerrank.com/challenges/strong-password/problem
public class StrongPassword {

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int missingChars = 0;
        boolean hasDigit = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        char[] specialChars = "!@#$%^&*()-+".toCharArray();
        int missingConditions = 0;
        boolean conditions[] = new boolean[4];

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                hasLowercase = true;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                hasUppercase = true;
            }
            for (int j = 0; j < specialChars.length; j++) {
                if (password.charAt(i) == specialChars[j]) {
                    hasSpecialChar = true;

                }
            }
        }
        conditions[0] = hasDigit;
        conditions[1] = hasLowercase;
        conditions[2] = hasUppercase;
        conditions[3] = hasSpecialChar;
//        System.out.println(hasDigit + " " + hasLowercase + " " + hasUppercase + " " + hasSpecialChar);
        for (int i = 0; i < conditions.length; i++) {
            if (conditions[i] == false) {
                missingConditions++;
            }
        }
//        System.out.println(missingConditions);
        if (hasDigit && hasLowercase && hasUppercase && hasSpecialChar) {
            if (n < 6) {
                missingChars = 6 - n;
            } else {
                missingChars = 0;
            }
        } else if (missingConditions > 0) {
            if (n + missingConditions >= 6) {
                missingChars = missingConditions;
            } else if (n + missingConditions < 6) {
                missingChars = missingConditions + (6 - (n + missingConditions));
            }
        }

        return missingChars;
    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(100, "dq!17+#qh*x-@s8x563og01154o*^9)7c*9-1y9o2a(^1g6(xi^m@u!6y7%v7y8mzj$t48j#rxuj22w4@6&3fr7!5*1+@l$661t)"));
    }
}
