package model;

import service.Book;

public class PhysicalBook implements Book {

	private final String title;

	public PhysicalBook(final String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return "Title: " + title;
	}
}