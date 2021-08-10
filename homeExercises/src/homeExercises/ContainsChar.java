package homeExercises;

public class ContainsChar {
	//TODO: Given a String s and a char c return true or false if String s contains char c; 

	public static boolean containsChar(String s, char c) {
		boolean contains = false;
		for(int i =0; i<s.length(); i++)
			if(s.charAt(i)==c) {
				contains = true;
				break;
			}
		return contains;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(containsChar("alb",'c'));
	}

}
