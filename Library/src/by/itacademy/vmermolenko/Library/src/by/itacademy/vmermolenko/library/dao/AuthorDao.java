package by.itacademy.vmermolenko.library.dao;

import java.util.List;

import by.itacademy.vmermolenko.library.entity.Author;

public interface AuthorDao {
	List<Author> getAuthors();
	List<Author> getAuthorID();
	
}
