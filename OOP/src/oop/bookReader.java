package oop;

public class bookReader {

	public static void main(String[] args) {
		// creating new instances
		Book firstBook = new Book(100);
		Book secondBook = new Book(100);
		Book thirdBook = new Book(100);

		firstBook.titleOne();
		secondBook.titleTwo();
		thirdBook.titleThree();

		firstBook.setNumberOfPages(200);
		System.out.println(firstBook.getNumberOfPages());
		firstBook.increaseNumberOfPages(100);
		System.out.println(firstBook.getNumberOfPages());
		firstBook.decreaseNumberOfPages(500);
		System.out.println(firstBook.getNumberOfPages());

		secondBook.setNumberOfPages(150);
		System.out.println(secondBook.getNumberOfPages());
		secondBook.increaseNumberOfPages(50);
		System.out.println(secondBook.getNumberOfPages());
		secondBook.decreaseNumberOfPages(500);
		System.out.println(secondBook.getNumberOfPages());

		thirdBook.setNumberOfPages(100);
		System.out.println(thirdBook.getNumberOfPages());
		thirdBook.increaseNumberOfPages(200);
		System.out.println(thirdBook.getNumberOfPages());
		thirdBook.decreaseNumberOfPages(500);
		System.out.println(thirdBook.getNumberOfPages());
	}

}
