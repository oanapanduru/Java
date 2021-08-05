package strings;

public class Exercise16 {

	public static void getBytesFromString(String input) {
		byte[]bytes = input.getBytes();
		for (int i =0; i<bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBytesFromString("hello");
		
		
	}

}
