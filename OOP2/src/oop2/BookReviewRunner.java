package oop2;

public class BookReviewRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookReview book = new BookReview("Olive J.", "The gataway of the mysterious robot");
		book.addReview(new Review(5, "excellent"));
		book.addReview(new Review(4, "loved it."));

		System.out.println(book);
	}


}
