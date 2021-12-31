package hackerRankExercises;

public class FrequencyOfLetters {
    public static void frequencyOfLetters(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < freq.length; j++) {
            if (freq[j] > 0) {
                char c = (char) (j + 'a');
                System.out.println("letter: " + c + " frequency: " + freq[j]);
            }
        }
    }

    public static void main(String[] args) {
        frequencyOfLetters("alabalaportocala");
    }
}
