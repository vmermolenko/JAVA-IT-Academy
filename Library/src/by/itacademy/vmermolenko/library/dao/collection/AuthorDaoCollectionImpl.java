package by.itacademy.vmermolenko.library.dao.collection;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.vmermolenko.library.dao.AuthorDao;
import by.itacademy.vmermolenko.library.entity.Author;

public class AuthorDaoCollectionImpl implements AuthorDao{

	@Override
	public List<Author> getAuthors() {
		// TODO Auto-generated method stub
		List<Author> list = new ArrayList<>(5);
		list.add(new Author(1, "Vadim", 2, 2, 2010));
		list.add(new Author(2, "Rambo", 1, 2, 2011));
		list.add(new Author(3, "Georg", 2, 3, 2012));
		list.add(new Author(4, "Leonid", 2, 2, 2013));
		list.add(new Author(5, "Jonn", 2, 2, 2014));
		
		
		return list;
	}

	@Override
	public List<Author> getAuthorID() {
		
		// TODO Auto-generated method stub
		return null;
	}

}
