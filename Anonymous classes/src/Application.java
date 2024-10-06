import model.PhysicalBook;
import service.Book;

import static service.Book.getBookVersion;

public class Application {

	public static void main(String[] args) {

		final Book reactBook = new Book() {
			@Override
			public String getTitle() {
				return "The Road to React " + getBookVersion() + " version";
			}
		};

		final PhysicalBook javaPhysicalBook = new PhysicalBook("Java Design Patterns") {
			@Override
			public String getDescription() {
				return "Third Edition";
			}
		};

		final String jsBookEdition = new PhysicalBook("Eloquent JavaScript") {
			public String getEdition() {
				return "Fourth Edition";
			}
		}.getEdition();

		// Prints
		System.out.printf("Title: %s, book cover: %s", reactBook.getTitle(), reactBook.getBookCover());
		System.out.println();
		System.out.printf("Title: %s, description: %s", javaPhysicalBook.getTitle(), javaPhysicalBook.getDescription());
		System.out.println();
		System.out.printf("Description: %s", jsBookEdition);
	}
}
