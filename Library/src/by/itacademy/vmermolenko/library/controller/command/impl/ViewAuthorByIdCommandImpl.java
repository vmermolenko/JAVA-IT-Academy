package by.itacademy.vmermolenko.library.controller.command.impl;

import java.util.Map;

import by.itacademy.vmermolenko.library.controller.command.BasicCommand;
import by.itacademy.vmermolenko.library.entity.CatalogAuthor;
import by.itacademy.vmermolenko.library.service.CatalogService;
import by.itacademy.vmermolenko.library.service.impl.RegularCatalogServiceImpl;

public class ViewAuthorByIdCommandImpl implements BasicCommand {

	CatalogService catalogService;
	
	@Override
	public void perfomAction(Map<String, Object> params) {
		
		System.out.println(params.get("author_id"));
		
		catalogService = new RegularCatalogServiceImpl();
		CatalogAuthor catalog = catalogService.listCatalogAuthor();
		;
		//move to other layer
		System.out.println(catalog.getAuthor((int)params.get("author_id")));
		

	}

}
