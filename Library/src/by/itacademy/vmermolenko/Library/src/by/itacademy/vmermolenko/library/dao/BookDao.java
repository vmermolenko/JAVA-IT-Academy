//data access object

package by.itacademy.vmermolenko.library.dao;

import java.util.List;

import by.itacademy.vmermolenko.library.entity.Book;

public interface BookDao {

	List<Book> getBooks();
}
