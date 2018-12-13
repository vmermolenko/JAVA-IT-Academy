package by.htp.library.service;

import java.util.List;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;

public interface CatalogService {
	List<Book> getCatalogBooks();
	List<Author> getCatalogAuthor();
}
