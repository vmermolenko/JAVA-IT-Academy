package by.htp.vmermolenko.carrental.web.service;

import java.sql.Date;
import java.util.List;

import by.htp.vmermolenko.carrental.web.entity.Auto;

public interface CatalogService {
	public List<Auto> getCatalogAuto();
	public Auto getCatalogAuto(int id);
	
	void registerOrderToCatalog(String id_car, String day, String fio, String passport, String phone, String email, String password, String comments);
	
	void insertCar(String marka, String year, String transmission, String fuel, String price, String description, String url);
	void updateCar(String id, String marka, String year, String transmission, String fuel, String price, String description, String url);
	void deleteCar(String id);
	
	String loginUser(String email, String password);
	String registrationUser(String fio, String passport, String phone, String email, String password);
}
