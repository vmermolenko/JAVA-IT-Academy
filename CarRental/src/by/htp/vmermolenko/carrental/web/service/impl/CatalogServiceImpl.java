package by.htp.vmermolenko.carrental.web.service.impl;

import java.util.List;

import by.htp.vmermolenko.carrental.web.dao.AutoDao;
import by.htp.vmermolenko.carrental.web.dao.impl.AutoDaoSQLImpl;
import by.htp.vmermolenko.carrental.web.entity.Auto;
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
	public void registerOrderToCatalog(String id_car, String fio, String phone, String email, String comments) {
		// TODO Auto-generated method stub
		autoDao.registerOrder(id_car, fio, phone, email, comments);
	}
}
