package by.htp.library.service;

import java.sql.Date;
import java.util.List;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;

public interface CatalogService {
	List<Book> getCatalogBooks();
	List<Author> getCatalogAuthor();
	void addAuthorToCatalog(String name, Date birthday, String email);
	void deleteAuthorFromCatalog(String id);
	void updateAuthorFromCatalog(String id, String name, String email);
}
