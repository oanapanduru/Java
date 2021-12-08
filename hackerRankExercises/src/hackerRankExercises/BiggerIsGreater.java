package hackerRankExercises;

//https://www.hackerrank.com/challenges/bigger-is-greater/problem
public class BiggerIsGreater {

    public static String biggerIsGreater(String w) {
        // Write your code here
        StringBuilder result = new StringBuilder();
        boolean exists = true;
        for (int i = w.length() - 1; i > 0; i--) {
            if (w.charAt(i) > w.charAt(i - 1) && w.charAt(i) != w.charAt(i - 1)) {
                result = result.append(w.substring(0, i - 1));
                result.append(w.charAt(i));
                result.append(w.charAt(i - 1));
                result.append(w.substring(i+1));
                break;
            } else {
                exists = false;
            }
        }
        if(result.length()>0){
            if(exists){
                return result.toString();
            }else{
                result = result.reverse();
                return result.toString();
            }

        }
       else{
           return "no answer";
        }

    }

    public static void main(String[] args) {
        System.out.println(biggerIsGreater("dkhc"));
    }
}
