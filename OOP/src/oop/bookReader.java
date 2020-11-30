package oop;

public class bookReader {

	public static void main(String[] args) {
		// creating new instances
		Book firstBook = new Book();
		Book secondBook = new Book();
		Book thirdBook = new Book();

		firstBook.titleOne();
		secondBook.titleTwo();
		thirdBook.titleThree();

		firstBook.setNumberOfPages(200);
		secondBook.setNumberOfPages(150);
		thirdBook.setNumberOfPages(100);
	}

}
