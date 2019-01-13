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
	
}
