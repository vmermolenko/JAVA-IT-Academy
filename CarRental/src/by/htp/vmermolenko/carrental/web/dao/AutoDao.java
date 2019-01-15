package by.htp.vmermolenko.carrental.web.dao;

import java.util.List;

import by.htp.vmermolenko.carrental.web.entity.Auto;

public interface AutoDao {
	List<Auto> readAll();
	void registerOrder(String id_car, String day, String fio, String passport, String phone, String email, String comments);
}
