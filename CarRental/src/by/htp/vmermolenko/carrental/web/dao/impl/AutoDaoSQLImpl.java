package by.htp.vmermolenko.carrental.web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.vmermolenko.carrental.web.dao.AutoDao;
import by.htp.vmermolenko.carrental.web.entity.Auto;

public class AutoDaoSQLImpl implements AutoDao {

	@Override
	public List<Auto> readAll() {
		// TODO Auto-generated method stub
		
		List<Auto> listAuto = new ArrayList();
		listAuto.add(new Auto(1, 2010, "Ford Fusion", "��������������", "������", 20, "���������� Ford Fusion ������� ��������� � ��� ����������, �����, ������� � ������������ ������� ������.\r\n" + 
				"\r\n" + 
				"			������ ��������� �� ������������� � ������ ���� ������ ���������� � ��������� ���������� � ���������������.\r\n" + 
				"			\r\n" + 
				"			��� ��������� � ��������� ������ �������� ����������� ����� �������� � ���������� � ������� ������ �������� �����������, ����������� ��������.\r\n" + 
				"			\r\n" + 
				"			������ ������� ��� ������� Ford Fusion ���������, ��� ���� ��������� �� ���:\r\n" + 
				"			\r\n" + 
				"			�������� ������ ����� ��������� � ��������������;\r\n" + 
				"			��������� �������������;\r\n" + 
				"			6-����������� �������������� �����������;\r\n" + 
				"			������������� �������, ������� �������� ���������� ������;\r\n" + 
				"			����������� ��������� �������� � ��������� ������������;\r\n" + 
				"			���������� ��������, �����-��������;\r\n" + 
				"			���������� �������� ���������;\r\n" + 
				"			������������ ������� ������ �������.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg"));
		
		listAuto.add(new Auto(2, 2014, "Ford Fusion", "��������������", "������", 20, "���������� Ford Fusion ������� ��������� � ��� ����������, �����, ������� � ������������ ������� ������.\r\n" + 
				"\r\n" + 
				"			������ ��������� �� ������������� � ������ ���� ������ ���������� � ��������� ���������� � ���������������.\r\n" + 
				"			\r\n" + 
				"			��� ��������� � ��������� ������ �������� ����������� ����� �������� � ���������� � ������� ������ �������� �����������, ����������� ��������.\r\n" + 
				"			\r\n" + 
				"			������ ������� ��� ������� Ford Fusion ���������, ��� ���� ��������� �� ���:\r\n" + 
				"			\r\n" + 
				"			�������� ������ ����� ��������� � ��������������;\r\n" + 
				"			��������� �������������;\r\n" + 
				"			6-����������� �������������� �����������;\r\n" + 
				"			������������� �������, ������� �������� ���������� ������;\r\n" + 
				"			����������� ��������� �������� � ��������� ������������;\r\n" + 
				"			���������� ��������, �����-��������;\r\n" + 
				"			���������� �������� ���������;\r\n" + 
				"			������������ ������� ������ �������.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg"));
		listAuto.add(new Auto(3, 2015, "Ford Fusion", "��������������", "������", 30, "���������� Ford Fusion ������� ��������� � ��� ����������, �����, ������� � ������������ ������� ������.\r\n" + 
				"\r\n" + 
				"			������ ��������� �� ������������� � ������ ���� ������ ���������� � ��������� ���������� � ���������������.\r\n" + 
				"			\r\n" + 
				"			��� ��������� � ��������� ������ �������� ����������� ����� �������� � ���������� � ������� ������ �������� �����������, ����������� ��������.\r\n" + 
				"			\r\n" + 
				"			������ ������� ��� ������� Ford Fusion ���������, ��� ���� ��������� �� ���:\r\n" + 
				"			\r\n" + 
				"			�������� ������ ����� ��������� � ��������������;\r\n" + 
				"			��������� �������������;\r\n" + 
				"			6-����������� �������������� �����������;\r\n" + 
				"			������������� �������, ������� �������� ���������� ������;\r\n" + 
				"			����������� ��������� �������� � ��������� ������������;\r\n" + 
				"			���������� ��������, �����-��������;\r\n" + 
				"			���������� �������� ���������;\r\n" + 
				"			������������ ������� ������ �������.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg"));
		listAuto.add(new Auto(4, 2016, "Ford Fusion", "��������������", "������", 50, "���������� Ford Fusion ������� ��������� � ��� ����������, �����, ������� � ������������ ������� ������.\r\n" + 
				"\r\n" + 
				"			������ ��������� �� ������������� � ������ ���� ������ ���������� � ��������� ���������� � ���������������.\r\n" + 
				"			\r\n" + 
				"			��� ��������� � ��������� ������ �������� ����������� ����� �������� � ���������� � ������� ������ �������� �����������, ����������� ��������.\r\n" + 
				"			\r\n" + 
				"			������ ������� ��� ������� Ford Fusion ���������, ��� ���� ��������� �� ���:\r\n" + 
				"			\r\n" + 
				"			�������� ������ ����� ��������� � ��������������;\r\n" + 
				"			��������� �������������;\r\n" + 
				"			6-����������� �������������� �����������;\r\n" + 
				"			������������� �������, ������� �������� ���������� ������;\r\n" + 
				"			����������� ��������� �������� � ��������� ������������;\r\n" + 
				"			���������� ��������, �����-��������;\r\n" + 
				"			���������� �������� ���������;\r\n" + 
				"			������������ ������� ������ �������.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg"));
		listAuto.add(new Auto(5, 2017, "Ford Fusion", "��������������", "������", 60, "���������� Ford Fusion ������� ��������� � ��� ����������, �����, ������� � ������������ ������� ������.\r\n" + 
				"\r\n" + 
				"			������ ��������� �� ������������� � ������ ���� ������ ���������� � ��������� ���������� � ���������������.\r\n" + 
				"			\r\n" + 
				"			��� ��������� � ��������� ������ �������� ����������� ����� �������� � ���������� � ������� ������ �������� �����������, ����������� ��������.\r\n" + 
				"			\r\n" + 
				"			������ ������� ��� ������� Ford Fusion ���������, ��� ���� ��������� �� ���:\r\n" + 
				"			\r\n" + 
				"			�������� ������ ����� ��������� � ��������������;\r\n" + 
				"			��������� �������������;\r\n" + 
				"			6-����������� �������������� �����������;\r\n" + 
				"			������������� �������, ������� �������� ���������� ������;\r\n" + 
				"			����������� ��������� �������� � ��������� ������������;\r\n" + 
				"			���������� ��������, �����-��������;\r\n" + 
				"			���������� �������� ���������;\r\n" + 
				"			������������ ������� ������ �������.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg"));
		listAuto.add(new Auto(6, 2018, "Ford Fusion", "��������������", "������", 40, "���������� Ford Fusion ������� ��������� � ��� ����������, �����, ������� � ������������ ������� ������.\r\n" + 
				"\r\n" + 
				"			������ ��������� �� ������������� � ������ ���� ������ ���������� � ��������� ���������� � ���������������.\r\n" + 
				"			\r\n" + 
				"			��� ��������� � ��������� ������ �������� ����������� ����� �������� � ���������� � ������� ������ �������� �����������, ����������� ��������.\r\n" + 
				"			\r\n" + 
				"			������ ������� ��� ������� Ford Fusion ���������, ��� ���� ��������� �� ���:\r\n" + 
				"			\r\n" + 
				"			�������� ������ ����� ��������� � ��������������;\r\n" + 
				"			��������� �������������;\r\n" + 
				"			6-����������� �������������� �����������;\r\n" + 
				"			������������� �������, ������� �������� ���������� ������;\r\n" + 
				"			����������� ��������� �������� � ��������� ������������;\r\n" + 
				"			���������� ��������, �����-��������;\r\n" + 
				"			���������� �������� ���������;\r\n" + 
				"			������������ ������� ������ �������.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg"));
		
		
		return listAuto;
	}

}
