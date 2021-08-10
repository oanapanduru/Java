package homeExercises;

public class LettersOnEvenPos {
	//TODO:Given a String s print all the letters that are on an even position.
	//Ex: alabala -> aaaa
 
	public static void printLettersOnEvenPos(String s) {
		for(int i=0; i<s.length(); i+=2) {
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLettersOnEvenPos("alabala");
	}

}
