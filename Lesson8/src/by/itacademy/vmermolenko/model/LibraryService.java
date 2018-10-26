package by.itacademy.vmermolenko.model;

import java.util.List;

public interface LibraryService {

	List<Book> getBookCatalog();

	Book getBook();

	void addBook(Book book);
	
	List<Reader> getReader();

}
