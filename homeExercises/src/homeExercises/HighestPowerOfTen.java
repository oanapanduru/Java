package homeExercises;

public class HighestPowerOfTen {

	// TODO: Given an integer n. Print the highest power of 10 that is smaller than n. 
	//Example: 5508 -> 3(10^3); 405 -> 2(10^2);

	public static int highestPowerOfTen(int n) {
		int power = 0;
		while(n/10>0) {
			power++;
			n = n/10;
		}
		return power;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(highestPowerOfTen(59994));
	}

}
