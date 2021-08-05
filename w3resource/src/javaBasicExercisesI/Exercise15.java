package javaBasicExercisesI;

public class Exercise15 {

	
	public static void swapNumbers(int a, int b) {
		System.out.println("initial values: " + "\na:" + a + "\nb:" + b);
		int temp = b;
		b = a;
		a = temp;
		System.out.println("after change values: " + "\na:" + a + "\nb:" + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapNumbers(1, 2);
	}

}
