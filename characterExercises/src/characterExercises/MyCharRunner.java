package characterExercises;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar character = new MyChar('c');
		character.print();
		System.out.println(character.isVowel());
		System.out.println(character.isDigit());
		System.out.println(character.isConsonante());
		System.out.println(character.isAlphabet());
		MyChar.alphabet();
		MyChar.alphabetUpper();

	}

}
