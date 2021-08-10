package homeExercises;

public class PrintAllCombWithoutLetter {
	// TODO: Write a method that has one parameter: String s. 
	// Write all possible variants of the String s without each of its letters;
	// Example: for String ‘table’ print: ‘able’, ‘tble’, ‘tale’, ‘tabe’, ‘tabl’

	public static void printAllCombWithoutLetter(String s) {
		for(int i = 0; i<s.length(); i++) {
			System.out.println(s.substring(0, i) +   s.substring(i+1));
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllCombWithoutLetter("table");
	}

}
