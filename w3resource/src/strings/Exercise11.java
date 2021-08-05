package strings;

public class Exercise11 {

	public static String createStringFromChar(char[] chars) {
		String charsUnited = "";
		for(int i =0; i< chars.length; i++) {
			charsUnited = charsUnited + chars[i];
		}
		return new String(charsUnited);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(createStringFromChar(new char[]{'a', 'b', 'c'}));
	}

}
