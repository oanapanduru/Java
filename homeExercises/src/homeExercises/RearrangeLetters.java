package homeExercises;

public class RearrangeLetters {
	//TODO:Given a String s rearrange it’s letters in alphabetical order.


	public static String rearrangeLetters(String s) {
		char [] letters= s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<letters.length-1; i++) {
			int minIdx =i;
			for(int j = i+1; j<letters.length; j++) {
				if(letters[j]<letters[minIdx]) {
					minIdx = j;
				}
			}
			char temp = letters[minIdx];
			letters[minIdx] = letters[i];
			letters[i]= temp;
		}
		for(int i=0; i<letters.length; i++) {
			sb.append(letters[i]);
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rearrangeLetters("abandiuownvllc"));
		
	}

}
