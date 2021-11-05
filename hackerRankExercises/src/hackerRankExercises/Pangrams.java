package hackerRankExercises;

public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here
        String result = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int match = 0;
        for (int i = 0; i < alphabet.length(); i++) {
            if (s.toLowerCase().indexOf(alphabet.charAt(i)) == -1) {
                match = -1;
                break;
            }
        }
        if (match != -1) {
            result = "pangram";
        } else {
            result = "not pangram";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }
}
