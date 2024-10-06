package service;

public interface Book {

	static String getBookVersion() {
		return "English";
	}

	default String getBookCover() {
		return "Hard";
	}

	String getTitle();
}
