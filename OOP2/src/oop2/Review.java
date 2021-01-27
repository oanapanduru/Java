package oop2;

public class Review {
	private int rating;
	private String review;

	public Review(int rating, String review) {
		// super();
		this.rating = rating;
		this.review = review;
	}

	@Override
	public String toString() {
		return String.format("rating - %d, review - %s", rating, review);
	}

}
