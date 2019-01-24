package by.htp.vmermolenko.carrental.web.service.impl;

import java.util.List;

import by.htp.vmermolenko.carrental.web.dao.AutoDao;
import by.htp.vmermolenko.carrental.web.dao.impl.AutoDaoSQLImpl;
import by.htp.vmermolenko.carrental.web.entity.Auto;
import by.htp.vmermolenko.carrental.web.entity.Order;
import by.htp.vmermolenko.carrental.web.service.CatalogService;

public class CatalogServiceImpl implements CatalogService {
	private AutoDao autoDao = new AutoDaoSQLImpl();

	@Override
	public List<Auto> getCatalogAuto() {
		// TODO Auto-generated method stub
		return autoDao.readAll();
	}

	@Override
	public Auto getCatalogAuto(int id) {
		// TODO Auto-generated method stub
		List<Auto> listAuto = autoDao.readAll();
		
		for (Auto itemAuto : listAuto) {
			if (itemAuto.getId() == id) 
			{
				return itemAuto;
			}
		}
		return null;
	}

	@Override
	public String registerOrderToCatalog(String id_car, String day, String fio, String passport, String phone, String email, String password, String comments) {
		// TODO Auto-generated method stub
		return autoDao.registerOrder(id_car, day, fio, passport, phone, email, password, comments);
	}

	@Override
	public void insertCar(String marka, String year, String transmission, String fuel, String price, String description,
			String url) {
		// TODO Auto-generated method stub
		autoDao.insertCar(marka, year, transmission, fuel, price, description, url);
	}

	@Override
	public void updateCar(String id, String marka, String year, String transmission, String fuel, String price,
			String description, String url) {
		// TODO Auto-generated method stub
		autoDao.updateCar(id, marka, year, transmission, fuel, price, description, url);
	}

	@Override
	public void deleteCar(String id) {
		// TODO Auto-generated method stub
		autoDao.deleteCar(id);
	}

	@Override
	public String loginUser(String email, String password) {
		// TODO Auto-generated method stub
		return autoDao.loginUser(email, password);
	}

	@Override
	public String registrationUser(String fio, String passport, String phone, String email, String password) {
		// TODO Auto-generated method stub
		return autoDao.registrationUser(fio, passport, phone, email, password);
	}

	@Override
	public List<Order> readOrderAll() {
		// TODO Auto-generated method stub
		return autoDao.readOrderAll();
	}

	@Override
	public List<Order> readOrderUser(String email) {
		// TODO Auto-generated method stub
		return autoDao.readOrderUser(email);
	}

	@Override
	public String registerPayment(String id_order, String cardnumber, String cardexpiry, String cardcvc, String total) {
		// TODO Auto-generated method stub
		return autoDao.registerPaymentUser(id_order, cardnumber, cardexpiry, cardcvc, total);

	}
}
