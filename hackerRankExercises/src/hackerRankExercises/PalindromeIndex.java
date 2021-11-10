package hackerRankExercises;

//https://www.hackerrank.com/challenges/palindrome-index/problem
public class PalindromeIndex {

    public static int palindromeIndex(String s) {
        int result = -1;
        int i = 0;
        int j = s.length() - 1;
        int a;
        int b;
        boolean isOk;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                a = i + 1;
                b = j;
                isOk = true;
                while(a < b) {
                    if(s.charAt(a) != s.charAt(b)) {
                        isOk = false;
                        break;
                    }
                    a++;
                    b--;
                }
                if(!isOk) {
                    a = i;
                    b = j - 1;
                    isOk = true;
                    while(a < b) {
                        if(s.charAt(a) != s.charAt(b)) {
                            isOk = false;
                            break;
                        }
                        a++;
                        b--;
                    }
                    if(isOk) {
                        result = j;
                    }
                } else {
                    result = i;
                }
                break;
            }
            i++;
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(palindromeIndex("hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh"));
//        System.out.println("test".substring(0,3) + "test".substring(4));
    }
}

