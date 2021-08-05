package strings;

public class Exercise18 {

	public static void uniqueIdentifier(String input) {
		int hash = input.hashCode();
		System.out.println(hash);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueIdentifier("Unique");
	}

}
