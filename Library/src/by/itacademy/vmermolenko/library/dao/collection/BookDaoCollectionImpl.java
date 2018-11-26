package by.itacademy.vmermolenko.library.dao.collection;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.vmermolenko.library.dao.BookDao;
import by.itacademy.vmermolenko.library.entity.Book;

public class BookDaoCollectionImpl implements BookDao {

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>(5);
		books.add(new Book(1, "Book1"));
		books.add(new Book(1, "Book2"));
		books.add(new Book(1, "Book3"));
		books.add(new Book(1, "Book4"));
		books.add(new Book(1, "Book5"));
		return books;
	}

}
