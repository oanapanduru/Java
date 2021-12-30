package practice;

//https://codingbat.com/prob/p170924
public class CodingBatp170924 {
    public static String changePi(String str) {
        int index = 0;
        if (str.length() < 2) {
            return str;
        } else {
            String string = "";
            string = string + str.charAt(index);
            if (str.charAt(index) == 'p' && str.charAt(index + 1) == 'i') {
                string = "3.14";
                index++;
            }
            index++;
            return string + changePi(str.substring(index));
        }
    }

    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
    }
}
