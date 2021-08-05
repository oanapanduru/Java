package homeExercises;

public class PrintNumberBackwards {

	
	public static int printNumberBackwards(int number) {
		int reversed = 0;
		while(number>0) {
			//int digit = number%10;
			reversed = reversed*10 + number%10;
			
			number  = number/10;
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printNumberBackwards(1234));
	}

}
