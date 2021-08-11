package homeExercises;

public class LastOccurencyOfChar {
	//TODO:Given a String s and a char c find last occurrence index of char c in String s;


	public static int lastOccurencyOfLetter(String s, char c) {
		int index = -1;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==c) {
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lastOccurencyOfLetter("alabala", 'c'));
	}

}
