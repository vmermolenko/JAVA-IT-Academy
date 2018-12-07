package by.itacademy.vmermolenko.library.controller.command.impl;

import java.util.Map;

import by.itacademy.vmermolenko.library.controller.command.BasicCommand;
import by.itacademy.vmermolenko.library.entity.Book;
import by.itacademy.vmermolenko.library.entity.Catalog;
import by.itacademy.vmermolenko.library.service.CatalogService;
import by.itacademy.vmermolenko.library.service.impl.RegularCatalogServiceImpl;

public class ViewBookByName implements BasicCommand{

	private CatalogService catalogService;
	
	@Override
	public void perfomAction(Map<String, Object> params) {
		
		String title = (String) params.get("book_title");
		// TODO Auto-generated method stub
		catalogService = new RegularCatalogServiceImpl();
		Book book = catalogService.listCatalog().searchByName(title);
		
		//move to other layer
		System.out.println(book);
	}

}
