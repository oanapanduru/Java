package homeExercises;

public class PrintFragmentsOsString {

	// TODO:
	// Write a method that receives one parameter s, String - that contains only
	// letters in upper or lower case;
	// this method should print all the fragments of the string;
	// Ex: s = “abcd”
	// Output: a,b,c,d,ab,bc,cd,abc,bcd,abcd
	// Tips: you don’t have to print them on one line; you can print them in any
	// order; your method should work if the String s is null or empty;
	public static void printFragmentsOfString(String s) {
		if (s == null) {
			System.out.println(" invalid input");
		} else if (s.isEmpty()) {
			System.out.println(" invalid input");
		}

		else {
			for (int i = 0; i < s.length() ; i++) {
				//for (int i = 0; i<s.length()-1; i++){
				for (int j = i +1; j <= s.length(); j++) {
					//for (int j = i+1; j < s.length(); j++) {
					//System.out.println("i:" + i + " " + " j:" + j);
					System.out.println(s.substring(i, j));
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFragmentsOfString("abcd");
	}

}
