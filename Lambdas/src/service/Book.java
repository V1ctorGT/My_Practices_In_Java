package service;

@FunctionalInterface
public interface Book {

	static final String VERSION = "English";

	default String getBookCover() {
		return "Soft";
	}

	String getTitle(final String title);
}
