package by.htp.library.dao;

import java.util.List;

import by.htp.library.entity.Author;

public interface AuthorDao {
	List<Author> readAll();
	void add_author(Author author);
	void delete_author(Author author);
	void update_author(Author author);
}
