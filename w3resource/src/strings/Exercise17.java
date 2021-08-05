package strings;

public class Exercise17 {

	public static void StringToCharArray(String input) {
		char[] stringToCharArray  = input.toCharArray();
		for(int i =0; i< stringToCharArray.length; i++) {
			System.out.println(stringToCharArray[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringToCharArray("hello there you");
	}

}
