package by.itacademy.vmermolenko.library.service;

import by.itacademy.vmermolenko.library.entity.Catalog;
import by.itacademy.vmermolenko.library.entity.CatalogAuthor;

public interface CatalogService {
	
	Catalog listCatalog();
	CatalogAuthor listCatalogAuthor();

}
