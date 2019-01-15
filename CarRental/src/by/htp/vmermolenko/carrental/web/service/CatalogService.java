package by.htp.vmermolenko.carrental.web.service;

import java.sql.Date;
import java.util.List;

import by.htp.vmermolenko.carrental.web.entity.Auto;

public interface CatalogService {
	public List<Auto> getCatalogAuto();
	public Auto getCatalogAuto(int id);
	
	void registerOrderToCatalog(String id_car, String day, String fio, String passport, String phone, String email, String comments);
}
