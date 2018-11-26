package by.itacademy.vmermolenko.library.controller.command.impl;

import java.util.Map;

import by.itacademy.vmermolenko.library.controller.command.BasicCommand;
import by.itacademy.vmermolenko.library.entity.Catalog;
import by.itacademy.vmermolenko.library.service.CatalogService;
import by.itacademy.vmermolenko.library.service.impl.RegularCatalogServiceImpl;

public class ViewBookCatalogCommand implements BasicCommand{
	
	private CatalogService catalogService;

	@Override
	public void perfomAction(Map<String, Object> params) {
		// TODO Auto-generated method stub
		catalogService = new RegularCatalogServiceImpl();
		Catalog catalog = catalogService.listCatalog();
		
		//move to other layer
		System.out.println(catalog);
		
	}

}
