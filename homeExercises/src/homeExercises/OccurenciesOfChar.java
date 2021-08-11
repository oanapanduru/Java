package homeExercises;

public class OccurenciesOfChar {
	//TODO: Given a String s and a char c find how many occurrences has char c in String s;

	public static int occurenciesOfChar(String s, char c) {
		int occurencies = 0;
		for(int i =0; i<s.length(); i++)
			if(s.charAt(i)==c) {
				occurencies++;
			}
		return occurencies;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(occurenciesOfChar("alabala", 'b'));
	}

}
