package hackerRankExercises;

public class TaumAndBday {
//TODO:https://www.hackerrank.com/challenges/taum-and-bday/problem
	public static long taumBday(int b, int w, int bc, int wc, int z) {
		// Write your code here
		long cost = 0;
		long bl = b;
		long wl = w;
		long bcl = bc;
		long wcl = wc;
		long zl = z;
		if ((bcl + z) < wcl) {
			cost = ((bcl+zl) * wl) + (bcl * bl);
		} else if ((wcl + zl) < bcl) {
			cost = ((wcl+zl) * bl) + (wcl * wl);
		} else {
			cost = (bcl * bl) + (wcl * wl);
		}
		return cost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(taumBday(443463982, 833847400,
				429734889, 628664883, 610875522));
//		System.out.println(taumBday(3,5,3,4,1));
	}

}
