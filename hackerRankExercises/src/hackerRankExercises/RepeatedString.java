package hackerRankExercises;

public class RepeatedString {

//	TODO:https://www.hackerrank.com/challenges/repeated-string/problem
	public static long repeatedString(String s, long n) {
		// Write your code here
		long times = 0;
		int timesPerString = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				timesPerString++;
			}
		}
		if (n % s.length() == 0) {
			times = timesPerString *(n / s.length());
		}
		else {
			int substring = (int) (n % s.length());
			times = (timesPerString *(n /s.length()))+ timesTheLetter(s.substring(0, substring)); 
		}
		return times;
	}
	public static long timesTheLetter(String s) {
		long times = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				times++;
			}
		}
		return times;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedString("abcac", 12));
//		epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq
//		549382313570
		

//		System.out.println(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570));
	}

}
