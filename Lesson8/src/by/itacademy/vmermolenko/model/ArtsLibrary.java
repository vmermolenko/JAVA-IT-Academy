package by.itacademy.vmermolenko.model;

import java.util.ArrayList;
import java.util.List;

public class ArtsLibrary implements BookService, ReaderService {

	
	private List<Book> books;

	{
		books = new ArrayList<>();
		books.add(new Book("Arts Book1"));
		books.add(new Book("Arts Book2"));
		books.add(new Book("Arts Book3"));
		books.add(new Book("Arts Book4"));
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
