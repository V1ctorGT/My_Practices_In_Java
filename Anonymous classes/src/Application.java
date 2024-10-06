import model.Book;
import service.BookInterface;

import static service.BookInterface.getBookVersion;

public class Application {

	public static void main(String[] args) {

		final BookInterface reactBook = new BookInterface() {
			@Override
			public String getTitle() {
				return "The Road to React " + getBookVersion() + " version";
			}
		};

		final Book javaBook = new Book("Java Design Patterns") {
			@Override
			public String getDescription() {
				return "Third Edition";
			}
		};

		final String jsBookEdition = new Book("Eloquent JavaScript") {
			public String getEdition() {
				return "Fourth Edition";
			}
		}.getEdition();

		// Prints
		System.out.printf("Title: %s, book cover: %s", reactBook.getTitle(), reactBook.getBookCover());
		System.out.println();
		System.out.printf("Title: %s, description: %s", javaBook.getTitle(), javaBook.getDescription());
		System.out.println();
		System.out.printf("Description: %s", jsBookEdition);
	}
}
