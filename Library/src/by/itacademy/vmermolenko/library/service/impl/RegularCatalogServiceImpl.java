package by.itacademy.vmermolenko.library.service.impl;

import java.util.Date;
import java.util.List;

import by.itacademy.vmermolenko.library.dao.BookDao;
import by.itacademy.vmermolenko.library.dao.collection.BookDaoCollectionImpl;
import by.itacademy.vmermolenko.library.entity.Book;
import by.itacademy.vmermolenko.library.entity.Catalog;
import by.itacademy.vmermolenko.library.service.CatalogService;

public class RegularCatalogServiceImpl implements CatalogService {
	
	private BookDao bookDao;

	@Override
	public Catalog listCatalog() {
		// TODO Auto-generated method stub
		
		Catalog catalog = new Catalog();
		catalog.setResponsiblePerson("Ivan Ivanov");
		catalog.setCreationDate(new Date());
		
		//bad solution? replace with Factory
		bookDao = new BookDaoCollectionImpl();
		
		List<Book> books = bookDao.getBooks();
		catalog.setBooks(books);
		
		return catalog;
	}

}
