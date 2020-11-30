package oop;

public class Book {
	private int numberOfPages;

	void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	void titleOne() {
		System.out.println("title of first book: Art of Computer Programming");
	}

	void titleTwo() {
		System.out.println("title of the second book: Effective Java");
	}

	void titleThree() {
		System.out.println("title of the third book: Clean Code");
	}
}
