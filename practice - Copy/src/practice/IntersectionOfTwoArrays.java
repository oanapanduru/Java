package practice;

//Given two arrays a and b(with int elements), create a third array c that represents the intersection of the two arrays.
public class IntersectionOfTwoArrays {

	public static void intersectionOfTwoArrays() {
		int[] first = { 2, 4, 7, 8, 3 };
		int[] second = { 3, 4, 6, 5, 1 };
		int size = 0;
		int[] result = null;
		if (first.length > 0 && second.length > 0) {
			for (int i = 0; i < first.length; i++) {
				for (int j = 0; j < second.length; j++) {
					if (first[i] == second[j]) {
						size = size + 1;
					}
				}
			}
			result = new int[size];
			int count = 0;
			for (int i = 0; i < first.length; i++) {
				for (int j = 0; j < second.length; j++) {
					if (first[i] == second[j]) {
						result[count] = first[i];
						count++;
					}
				}
			}
		}
		else {
			result = new int[0];
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intersectionOfTwoArrays();
	}

}
