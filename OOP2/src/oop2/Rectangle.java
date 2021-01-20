package oop2;

public class Rectangle {
	private int lenght;
	private int width;

	public Rectangle(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
	}


	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return this.lenght * this.width;
	}

	public int perimeter() {
		return 2 * (this.lenght + this.width);
	}

	@Override
	public String toString() {
		return String.format("lenght - %d, width - %d", lenght, width);
	}

}
