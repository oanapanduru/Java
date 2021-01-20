package oop2;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 10);
		System.out.println("initial values of the rectangle: " + rectangle);
		rectangle.setLenght(20);
		System.out.println("lenght is: " + rectangle.getLenght());
		rectangle.setWidth(20);
		System.out.println("width is: " + rectangle.getWidth());
		System.out.println("area is: " + rectangle.area());
		System.out.println("perimeter is: " + rectangle.perimeter());
		System.out.println("details of the prectangle: " + rectangle);
	}

}
