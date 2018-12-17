package by.htp.library.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.sql.Date;

import by.htp.library.dao.AuthorDao;
import by.htp.library.dao.BookDao;
import by.htp.library.dao.impl.AuthorDaoSQLImpl;
import by.htp.library.dao.impl.BookDaoSQLImpl;
import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.service.CatalogService;


public class CatalogServiceImpl implements CatalogService {

	private BookDao bookDao = new BookDaoSQLImpl();
	private AuthorDao authorDao = new AuthorDaoSQLImpl();
	@Override
	public List<Book> getCatalogBooks() {
		// TODO Auto-generated method stub
		
		/*
		List<Book> books = new ArrayList<>();
		books.add(new Book(1,"book1"));
		books.add(new Book(2,"book2"));
		books.add(new Book(3,"book3"));
		books.add(new Book(4,"book4"));
		books.add(new Book(5,"book5"));
		*/
		//List<Book> books = bookDao.readAll();
		
		
		return bookDao.readAll();
	}
	@Override
	public List<Author> getCatalogAuthor() {
		// TODO Auto-generated method stub
		return authorDao.readAll();
	}
	@Override
	public void addAuthorToCatalog(String name, Date birthday, String email) {
		// TODO Auto-generated method stub
		Author author = new Author(name, birthday, email);
		authorDao.add_author(author);
			
	}
	@Override
	public void deleteAuthorFromCatalog(String id) {
		// TODO Auto-generated method stub
		Author author = new Author(Integer.parseInt(id)); 
		authorDao.delete_author(author);
	}
	@Override
	public void updateAuthorFromCatalog(String id, String name, String email) {
		// TODO Auto-generated method stub
		Author author = new Author(Integer.parseInt(id), name, email); 
		authorDao.update_author(author);
	}
	
}
