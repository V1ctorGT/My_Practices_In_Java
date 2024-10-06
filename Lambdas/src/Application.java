import service.Book;

import java.util.function.Function;

public class Application {

	public static void main(String[] args) {

		final Book javaBook = title -> title;

		final Function<String, String> jsBookFn = title -> title;
		final String jsBookTitle = obtainTitleFromFunction(jsBookFn);

		// Prints
		System.out.printf("Title: %s", javaBook.getTitle("Effective Java"));
		System.out.println();
		System.out.printf("Title: %s", jsBookTitle);
	}

	private static String obtainTitleFromFunction(Function<String, String> jsBookFn) {
		return jsBookFn.apply("Eloquent JavaScript");
	}
}
