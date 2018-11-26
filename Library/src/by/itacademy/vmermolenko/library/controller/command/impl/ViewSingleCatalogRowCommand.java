package by.itacademy.vmermolenko.library.controller.command.impl;

import java.util.Map;

import by.itacademy.vmermolenko.library.controller.command.BasicCommand;
import by.itacademy.vmermolenko.library.entity.Book;
import by.itacademy.vmermolenko.library.entity.Catalog;
import by.itacademy.vmermolenko.library.service.CatalogService;
import by.itacademy.vmermolenko.library.service.impl.RegularCatalogServiceImpl;

public class ViewSingleCatalogRowCommand implements BasicCommand{

	private CatalogService catalogService;
	
	@Override
	//add params to method
	public void perfomAction(Map<String, Object> params) {
		// TODO Auto-generated method stub
		catalogService = new RegularCatalogServiceImpl();
		Catalog catalog = catalogService.listCatalog();
		
		Book row = catalog.getSingleRow(2);
		
		System.out.println(row);
	}

}
