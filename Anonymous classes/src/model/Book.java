package model;

public class Book {

	private final String title;

	public Book(final String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return "Title: " + title;
	}
}