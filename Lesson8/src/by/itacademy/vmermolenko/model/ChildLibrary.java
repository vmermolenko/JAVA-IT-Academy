package by.itacademy.vmermolenko.model;

import java.util.ArrayList;
import java.util.List;

public class ChildLibrary implements BookService, ReaderService  {

	private List<Book> books;

	{
		books = new ArrayList<>();
		books.add(new Book("Book1"));
		books.add(new Book("Book2"));
		books.add(new Book("Book3"));
		books.add(new Book("Book4"));
	}

	/**
	 * 
	 */
	public ChildLibrary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book[] getChildBooks() {
		return new Book[] { new Book("Book0") };
	}

	@Override
	public List<Book> getBookCatalog() {
		// TODO Auto-generated method stub

		return books;
	}

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Reader> getReader() {
		// TODO Auto-generated method stub
		return null;
	}

}
