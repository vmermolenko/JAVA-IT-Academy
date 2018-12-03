package by.itacademy.vmermolenko.library.service.impl;

import java.util.Date;
import java.util.List;

import by.itacademy.vmermolenko.library.dao.AuthorDao;
import by.itacademy.vmermolenko.library.dao.BookDao;
import by.itacademy.vmermolenko.library.dao.collection.AuthorDaoCollectionImpl;
import by.itacademy.vmermolenko.library.dao.collection.BookDaoCollectionImpl;
import by.itacademy.vmermolenko.library.dao.sql.BookDaoSQLImpl;
import by.itacademy.vmermolenko.library.entity.Author;
import by.itacademy.vmermolenko.library.entity.Book;
import by.itacademy.vmermolenko.library.entity.Catalog;
import by.itacademy.vmermolenko.library.entity.CatalogAuthor;
import by.itacademy.vmermolenko.library.service.CatalogService;

public class RegularCatalogServiceImpl implements CatalogService {

	private BookDao bookDao;
	private AuthorDao authorDao;

	@Override
	public Catalog listCatalog() {
		// TODO Auto-generated method stub

		Catalog catalog = new Catalog();
		catalog.setResponsiblePerson("Ivan Ivanov");
		catalog.setCreationDate(new Date());

		// bad solution? replace with Factory
		//bookDao = new BookDaoCollectionImpl();
		bookDao = new BookDaoSQLImpl();

		List<Book> books = bookDao.getBooks();
		catalog.setBooks(books);

		return catalog;
	}

	@Override
	public CatalogAuthor listCatalogAuthor() {
		// TODO Auto-generated method stub
		CatalogAuthor catalog = new CatalogAuthor();
		catalog.setResponsiblePerson("Ivan Ivanov");
		catalog.setCreationDate(new Date());

		// bad solution? replace with Factory
		authorDao = new AuthorDaoCollectionImpl();

		List<Author> list = authorDao.getAuthors();
		catalog.setList(list);

		return catalog;
	}

}
