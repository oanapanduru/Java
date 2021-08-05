package javaBasicExercisesI;

public class Exercise13 {

	public static void printRectangle(double width, double height) {
		System.out.println(" area is: " + width + " * " + height + " = "+ width*height +"\n" +
				" perimeter is: 2 * (" + width + " * " + height + " )"+  " = "+2*(width+height));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRectangle(5.5, 8.5);
	}

}
