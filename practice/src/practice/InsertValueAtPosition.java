package practice;

//Given an array a, and two variables i and v. Insert value v at position i in the array a. Print array a after that.

public class InsertValueAtPosition {

	public static void insertValueAtPosition(int position) {
		String[] given = { "hello", "there", "you", "handsome", "looking", "guy" };
		String[] result = new String[given.length + 1];
		String v = "very";
		if (position < given.length) {
			for (int i = 0; i < given.length +1; i++) {
				if(i<position) {
				result[i] = given[i];
				}
				else if (i == position) {
					result[i] = v;
					
				}
				else {
					result[i] = given[i-1];
				}
			}

		}
		for (int j = 0; j < result.length; j++) {
			System.out.print(" " + result[j]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertValueAtPosition(3);
	}

}
