package by.htp.vmermolenko.carrental.web.dao;

import java.util.List;

import by.htp.vmermolenko.carrental.web.entity.Auto;
import by.htp.vmermolenko.carrental.web.entity.Order;

public interface AutoDao {
	List<Auto> readAll();
	String registerOrder(String id_car, String day, String fio, String passport, String phone, String email, String password, String comments);
	
	void insertCar(String marka, String year, String transmission, String fuel, String price, String description, String url);
	void updateCar(String id, String marka, String year, String transmission, String fuel, String price, String description, String url);
	void deleteCar(String id);
	
	String loginUser(String email, String password);
	String registrationUser(String fio, String passport, String phone, String email, String password);
	
	List<Order> readOrderAll();
	List<Order> readOrderUser(String email);
	
	String registerPaymentUser(String id_order, String cardnumber, String cardexpiry, String cardcvc, String total);
}
