package practice;

//Given two arrays a and b(with int elements), create a third array c that represents the union of the two arrays.

public class UnionOfTwoArrays {

	public static void unionOfTwoArrays() {
		int[] first = { 2, 4, 7, 8, 3 };
		int[] second = { 3, 4, 6, 5, 1 };
		int count = first.length;
		int[] result = null;
		if (first.length > 0 && second.length > 0) {
			for (int i = 0; i < second.length; i++) {
				boolean flag = false;
				for (int j = 0; j < first.length; j++) {
					if (first[j] == second[i]) {
						flag = true;
					}
				}
				if (flag == false) {
					count++;
				}
			}
			int count2 = first.length;
			result = new int[count];
			for (int k = 0; k < first.length; k++) {
				result[k] = first[k];
			}
			for (int i = 0; i < second.length; i++) {
				boolean flag = false;
				for (int j = 0; j < first.length; j++) {
					if (second[i] == first[j]) {
						flag = true;
					}
				}
				if (flag == false) {
					result[count2] = second[i];
					count2++;
				}
			}
		} else if (first.length > 0) {
			result = new int[first.length];
			for (int i = 0; i < first.length; i++) {
				result[i] = first[i];
			}
		} else if(second.length>0){
			result = new int[second.length];
			for (int i = 0; i < second.length; i++) {
				result[i] = second[i];
			}
		}
		else{
			result = new int[0];
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unionOfTwoArrays();
	}

}
