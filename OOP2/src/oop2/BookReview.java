package oop2;

import java.util.ArrayList;

public class BookReview {
	private String author;
	private String name;
	private ArrayList<Review> review = new ArrayList<>();

	public BookReview(String author, String name) {
		this.author = author;
		this.name = name;
	}

	public void addReview(Review review) {
		this.review.add(review);
	}

	@Override
	public String toString() {
		return String.format("author - %s, name - %s, Review - %s ", author, name, review);
	}
}
