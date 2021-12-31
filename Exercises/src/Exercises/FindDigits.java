package hackerRankExercises;

public class FindDigits {

	// TODO:https://www.hackerrank.com/challenges/find-digits/problem?h_r=next-challenge&h_v=zen

	public static int findDigits(int n) {
		// Write your code here
		int count = 0;
		String s = Integer.toString(n);
		int[] digits = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			digits[i] = Character.getNumericValue(s.charAt(i));
		}
		for (int i = 0; i < digits.length; i++) {
			if(digits[i]!=0) {
			if (n % digits[i] == 0) {
				count++;
			}
			}
		}
		return count;
	}
	public static int findDigits2(int n) {
		// Write your code here
		int count = 0;
		int digit = 0;
		while(n>0) {
			//int digit = number%10;
			digit = n%10;
			if(digit!=0 ) {
				if(n%digit==0) {
					count++;
				}
			}
			n  = n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findDigits2(124));
	}

}
