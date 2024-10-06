package service;

public interface BookInterface {

	static String getBookVersion() {
		return "English";
	}

	default String getBookCover() {
		return "Hard";
	}

	String getTitle();
}
