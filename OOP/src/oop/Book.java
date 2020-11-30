package oop;

public class Book {
	private int numberOfPages;

	Book(int numberOfpages) {
		this.numberOfPages = numberOfPages;
	}

	void setNumberOfPages(int numberOfPages) {
		if(numberOfPages > 0) {
			this.numberOfPages = numberOfPages;
		}
	}

	int getNumberOfPages() {
		return this.numberOfPages;
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

	public void increaseNumberOfPages(int howMuch) {
		setNumberOfPages(this.numberOfPages + howMuch);
	}

	public void decreaseNumberOfPages(int howMuch) {
		setNumberOfPages(this.numberOfPages - howMuch);
	}
}
