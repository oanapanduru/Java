package homeExercises;

public class ReplaceLettersLessThan {

	// TODO: Given a String s, a char c and an int x. 
	//Replace in s all letters that alphabetically  are less than char c 
	//with the character represented by ascii code x.
	public static String replaceLettersLessThan(String s, char c, int x) {
		String result = "";
		char letter = 0;
		for(int i=0; i<s.length(); i++) {
			letter = s.charAt(i);
			if(letter<c) {
			letter = (char) x;	
			result = result + letter;
			}
			else {
				result = result + s.charAt(i);
			}
		}
		return result;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceLettersLessThan("xaaaaacbbbbbcxcccx", 'x', 63));
	}

}
