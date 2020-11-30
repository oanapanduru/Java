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
		System.out.println(firstBook.getNumberOfPages());
		secondBook.setNumberOfPages(150);
		System.out.println(secondBook.getNumberOfPages());
		thirdBook.setNumberOfPages(100);
		System.out.println(thirdBook.getNumberOfPages());
	}

}
