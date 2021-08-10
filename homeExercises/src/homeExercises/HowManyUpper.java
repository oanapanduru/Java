package homeExercises;

public class HowManyUpper {
	// TODO Given a String s find how many upper case letters are in it.
	
	public static int howManyUpper(String s) {
		int upper = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == Character.toUpperCase(s.charAt(i))) {
				upper++;
			}
		}
		return upper;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(howManyUpper("KafghjklkjhgtT") );
	}

}
