package arrays;

public class GetElementsOfArray {

	public static void main(String[] args) {
		String[] var = {"ala", "bala", "portocala"};
		for (int i = 0; i < var.length; i++) {
			System.out.println(var[i]);
		}
		//using for-each;
		for(String x :var) {
			System.out.println(x);
		}

	}

}
