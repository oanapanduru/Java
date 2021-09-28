package hackerRankExercises;

public class AppendAndDelete {

	// TODO:https://www.hackerrank.com/challenges/append-and-delete/problem?h_r=next-challenge&h_v=zen
	public static String appendAndDelete(String s, String t, int k) {
		String result = "";
		int prefixLength = 0;

		for (int i = 0; i < s.length() && i < t.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				break;
			}
			prefixLength++;
		}
		if(s.length() + t.length() <= k ) {
			result = "Yes";
		}
		else if (prefixLength > 0) {
			int diff = (s.length() - prefixLength) + (t.length() - prefixLength);
			if ((k - diff >= 0 && diff % 2 == k % 2)) {
				result = "Yes";
			} else {
				result = "No";
			}

		} else {
			int diff = s.length() + t.length();
			if ((k - diff >= 0 && diff % 2 == k % 2) ) {
				result = "Yes";
			} else {
				result = "No";
			}
		}
		// System.out.println(prefixLength);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(appendAndDelete("abc", "def", 6));
		// hackerhappy
		// hackerrank
		// 9
		
//		System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
		System.out.println(appendAndDelete("aaaaaaaaaa", "aaaaa", 7));
	}

}
