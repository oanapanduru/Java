package homeExercises;

public class PrintFragmentsContainingLetter {
	// TODO: Write a method that receives one parameter s, String - that contains
	// only letters in upper or lower case;
	// this method should print all the fragments of the string that contains at
	// least one of the letters ‘a’,’b’ or ‘c’
	// in upper case or lower case;your method should work if the String s is null
	// or empty;
	public static void printFragmentsContainingLetter(String s) {
		
	if(s == null) {	
		System.out.println("invalid input");
	}
	else if( s.isEmpty()) {
		System.out.println("invalid input");
	}
	
	else {	
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				if(s.substring(i, j).contains("a") || s.substring(i, j).contains("b") || s.substring(i, j).contains("c")
						|| s.substring(i, j).contains("A") || s.substring(i, j).contains("B") || s.substring(i, j).contains("C")) {
					System.out.println(s.subSequence(i, j));
				}
			}
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFragmentsContainingLetter("Alexandru");
	}

}
