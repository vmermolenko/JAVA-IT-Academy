package by.htp.vmermolenko.carrental.web.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import by.htp.vmermolenko.carrental.web.dao.AutoDao;
import by.htp.vmermolenko.carrental.web.entity.Auto;
import by.htp.vmermolenko.carrental.web.entity.Order;

import static by.htp.vmermolenko.carrental.web.dao.utils.DaoConstant.*;

public class AutoDaoSQLImpl implements AutoDao {

	private static final String SQL_INSERT_AUTO = "INSERT INTO autopark.auto (marka, year, transmission, fuel, price, description, url) VALUES (?,?,?,?,?,?,?)";
	private static final String SQL_DELETE_AUTO = "DELETE FROM autopark.auto WHERE id = ?";
	private static final String SQL_UPDATE_AUTO = "UPDATE autopark.auto SET marka = ?, year = ?, transmission = ?, fuel = ?, price = ?, description = ?, url = ? WHERE id = ?";
	private static final String SQL_INSERT_ORDER = "INSERT INTO autopark.order (id_car, day, fio, passport, phone, email, password, comments ) VALUES (?,?,?,?,?,?,?,?)";
	
	
	@Override
	public List<Auto> readAll() {
		// TODO Auto-generated method stub
		
		List<Auto> listAuto = new ArrayList();
		
		/*
		listAuto.add(new Auto(1, 2010, "Ford Fusion", "Автоматическая", "Бензин", 20, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Отличный баланс между мощностью и экономичностью;\r\n" + 
				"			Идеальная управляемость;\r\n" + 
				"			6-ступенчатая автоматическая трансмиссия;\r\n" + 
				"			Анатомические сиденья, высокое качество материалов салона;\r\n" + 
				"			Безупречные параметры активной и пассивной безопасности;\r\n" + 
				"			Управление климатом, круиз-контроль;\r\n" + 
				"			Просторное багажное отделение;\r\n" + 
				"			Акустическая система уровня премиум.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg"));
		
		listAuto.add(new Auto(2, 2013, "Lamborghini Gallardo", "6 Spd E-Gear", "Бензин", 100, "2013 Lamborghini Gallardo LP550-2 - всего 34 771 миля! Этот Gallardo имеет 5,2-литровый двигатель V10 мощностью 542 л.с. и имеет E-gear трансмиссию. Механизм \"E-gear\" позволяет водителю переключать передачи намного быстрее, чем с механической коробкой передач. Водитель перемещается вверх и вниз через весла за рулем, но также может переключиться в автоматический режим. Этот Gallardo будет делать 0-60 миль в час за 3,3 секунды. Он пробежит 1/4 мили за 11,3 секунды и разгонится до максимальной скорости 200 миль в час! Этот Lamborghini отделан экстерьером Nero Noctis Black с кожаным салоном Nero Perseus Black с красной контрастной строчкой. Этот Gallard имеет МНОГО заводских опций, включая: 6-ступенчатую коробку передач E-Gear (заводская опция $ 10 000), переднюю подъемную систему, красные тормозные суппорты, навигационную систему, камеру заднего вида, Bluetooth, рулевое колесо с плоским дном, дорожный пакет включает: сиденья с подогревом , ящик для хранения водителя, подстаканники. Пакет кожаного интерьера, который включает в себя: кожаную юбку рычага переключения передач, кожаную отделку двери, кожаную отделку приборной панели и дополнительную отделку салона кожей Переднее крыло в цвет кузова, кожаная обивка потолка, кожаные козырьки, задние датчики расстояния парковки и многое другое. Этот автомобиль - взрыв для вождения (буквально). И повернет головы куда угодно. Но это также отличный автомобиль для ежедневного водителя. Система выпуска отработавших газов на этом автомобиле имеет управляемый компьютером выпускной клапан, который тихо ездит по городу при движении в обычном режиме, но когда вы садитесь в него, выхлоп открывается для этого глубокого хриплого фирменного звука Lamborghini!" + 
				"			Акустическая система уровня премиум.", "img/2013-lamborghini-gallardo.jpg"));
		listAuto.add(new Auto(3, 2015, "Lamborghini Aventador", "Автоматическая", "Бензин", 30, "Для Lamborghini революционное мышление лежит в основе работы. Будь это дизайн, вдохновленный воздухоплаванием, технологии двигателя V12 или широкое использование углепластика — выход за существующие пределы является частью нашей философии. Новые модели Aventador созданы, чтобы превзойти концепцию производительности, установить новый стандарт в мире суперкаров и превратить автомобили будущего в реальность сегодняшнего дня. Семейство суперкаров, которые с полным правом уже можно назвать культовыми.", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Lamborghini_Aventador_SVJ%2C_Paris_Motor_Show_2018%2C_IMG_0655.jpg/1024px-Lamborghini_Aventador_SVJ%2C_Paris_Motor_Show_2018%2C_IMG_0655.jpg"));
		listAuto.add(new Auto(4, 2016, "Lamborghini Urus", "Автоматическая", "Бензин", 50, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Отличный баланс между мощностью и экономичностью;\r\n" + 
				"			Идеальная управляемость;\r\n" + 
				"			6-ступенчатая автоматическая трансмиссия;\r\n" + 
				"			Анатомические сиденья, высокое качество материалов салона;\r\n" + 
				"			Безупречные параметры активной и пассивной безопасности;\r\n" + 
				"			Управление климатом, круиз-контроль;\r\n" + 
				"			Просторное багажное отделение;\r\n" + 
				"			Акустическая система уровня премиум.", "img/lamborghini-urus.jpg"));
		listAuto.add(new Auto(5, 2017, "Lamborghini Urus", "Автоматическая", "Бензин", 60, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Отличный баланс между мощностью и экономичностью;\r\n" + 
				"			Идеальная управляемость;\r\n" + 
				"			6-ступенчатая автоматическая трансмиссия;\r\n" + 
				"			Анатомические сиденья, высокое качество материалов салона;\r\n" + 
				"			Безупречные параметры активной и пассивной безопасности;\r\n" + 
				"			Управление климатом, круиз-контроль;\r\n" + 
				"			Просторное багажное отделение;\r\n" + 
				"			Акустическая система уровня премиум.", "img/lamborghini-urus3.jpg"));
		listAuto.add(new Auto(6, 2018, "Ford Fusion", "Автоматическая", "Бензин", 40, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Отличный баланс между мощностью и экономичностью;\r\n" + 
				"			Идеальная управляемость;\r\n" + 
				"			6-ступенчатая автоматическая трансмиссия;\r\n" + 
				"			Анатомические сиденья, высокое качество материалов салона;\r\n" + 
				"			Безупречные параметры активной и пассивной безопасности;\r\n" + 
				"			Управление климатом, круиз-контроль;\r\n" + 
				"			Просторное багажное отделение;\r\n" + 
				"			Акустическая система уровня премиум.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg"));
		listAuto.add(new Auto(1, 2010, "Ford Fusion", "Автоматическая", "Бензин", 20, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Отличный баланс между мощностью и экономичностью;\r\n" + 
				"			Идеальная управляемость;\r\n" + 
				"			6-ступенчатая автоматическая трансмиссия;\r\n" + 
				"			Анатомические сиденья, высокое качество материалов салона;\r\n" + 
				"			Безупречные параметры активной и пассивной безопасности;\r\n" + 
				"			Управление климатом, круиз-контроль;\r\n" + 
				"			Просторное багажное отделение;\r\n" + 
				"			Акустическая система уровня премиум.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg"));
		
		listAuto.add(new Auto(2, 2013, "Lamborghini Gallardo", "6 Spd E-Gear", "Бензин", 100, "2013 Lamborghini Gallardo LP550-2 - всего 34 771 миля! Этот Gallardo имеет 5,2-литровый двигатель V10 мощностью 542 л.с. и имеет E-gear трансмиссию. Механизм \"E-gear\" позволяет водителю переключать передачи намного быстрее, чем с механической коробкой передач. Водитель перемещается вверх и вниз через весла за рулем, но также может переключиться в автоматический режим. Этот Gallardo будет делать 0-60 миль в час за 3,3 секунды. Он пробежит 1/4 мили за 11,3 секунды и разгонится до максимальной скорости 200 миль в час! Этот Lamborghini отделан экстерьером Nero Noctis Black с кожаным салоном Nero Perseus Black с красной контрастной строчкой. Этот Gallard имеет МНОГО заводских опций, включая: 6-ступенчатую коробку передач E-Gear (заводская опция $ 10 000), переднюю подъемную систему, красные тормозные суппорты, навигационную систему, камеру заднего вида, Bluetooth, рулевое колесо с плоским дном, дорожный пакет включает: сиденья с подогревом , ящик для хранения водителя, подстаканники. Пакет кожаного интерьера, который включает в себя: кожаную юбку рычага переключения передач, кожаную отделку двери, кожаную отделку приборной панели и дополнительную отделку салона кожей Переднее крыло в цвет кузова, кожаная обивка потолка, кожаные козырьки, задние датчики расстояния парковки и многое другое. Этот автомобиль - взрыв для вождения (буквально). И повернет головы куда угодно. Но это также отличный автомобиль для ежедневного водителя. Система выпуска отработавших газов на этом автомобиле имеет управляемый компьютером выпускной клапан, который тихо ездит по городу при движении в обычном режиме, но когда вы садитесь в него, выхлоп открывается для этого глубокого хриплого фирменного звука Lamborghini!" + 
				"			Акустическая система уровня премиум.", "img/2013-lamborghini-gallardo.jpg"));
		listAuto.add(new Auto(3, 2015, "Lamborghini Aventador", "Автоматическая", "Бензин", 30, "Для Lamborghini революционное мышление лежит в основе работы. Будь это дизайн, вдохновленный воздухоплаванием, технологии двигателя V12 или широкое использование углепластика — выход за существующие пределы является частью нашей философии. Новые модели Aventador созданы, чтобы превзойти концепцию производительности, установить новый стандарт в мире суперкаров и превратить автомобили будущего в реальность сегодняшнего дня. Семейство суперкаров, которые с полным правом уже можно назвать культовыми.", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Lamborghini_Aventador_SVJ%2C_Paris_Motor_Show_2018%2C_IMG_0655.jpg/1024px-Lamborghini_Aventador_SVJ%2C_Paris_Motor_Show_2018%2C_IMG_0655.jpg"));
		listAuto.add(new Auto(4, 2016, "Lamborghini Urus", "Автоматическая", "Бензин", 50, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Отличный баланс между мощностью и экономичностью;\r\n" + 
				"			Идеальная управляемость;\r\n" + 
				"			6-ступенчатая автоматическая трансмиссия;\r\n" + 
				"			Анатомические сиденья, высокое качество материалов салона;\r\n" + 
				"			Безупречные параметры активной и пассивной безопасности;\r\n" + 
				"			Управление климатом, круиз-контроль;\r\n" + 
				"			Просторное багажное отделение;\r\n" + 
				"			Акустическая система уровня премиум.", "img/lamborghini-urus.jpg"));
		listAuto.add(new Auto(5, 2017, "Lamborghini Urus", "Автоматическая", "Бензин", 60, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Отличный баланс между мощностью и экономичностью;\r\n" + 
				"			Идеальная управляемость;\r\n" + 
				"			6-ступенчатая автоматическая трансмиссия;\r\n" + 
				"			Анатомические сиденья, высокое качество материалов салона;\r\n" + 
				"			Безупречные параметры активной и пассивной безопасности;\r\n" + 
				"			Управление климатом, круиз-контроль;\r\n" + 
				"			Просторное багажное отделение;\r\n" + 
				"			Акустическая система уровня премиум.", "img/lamborghini-urus3.jpg"));
		listAuto.add(new Auto(6, 2018, "Ford Fusion", "Автоматическая", "Бензин", 40, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Отличный баланс между мощностью и экономичностью;\r\n" + 
				"			Идеальная управляемость;\r\n" + 
				"			6-ступенчатая автоматическая трансмиссия;\r\n" + 
				"			Анатомические сиденья, высокое качество материалов салона;\r\n" + 
				"			Безупречные параметры активной и пассивной безопасности;\r\n" + 
				"			Управление климатом, круиз-контроль;\r\n" + 
				"			Просторное багажное отделение;\r\n" + 
				"			Акустическая система уровня премиум.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg"));
		*/
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from auto");

				while (rs.next()) {
					int id = rs.getInt("id");
					int year = rs.getInt("year");
					String marka = rs.getString("marka");
					String transmission = rs.getString("transmission");
					String fuel = rs.getString("fuel");
					int price = rs.getInt("price");
					String description = rs.getString("description");
					String url = rs.getString("url");
					

					Auto auto = new Auto(id, year, marka, transmission, fuel, price, description, url);

					listAuto.add(auto);

					// System.out.println("id: " + id + ", title: " + title);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}

		
		return listAuto;
	}

	@Override
	public String registerOrder(String id_car, String day, String fio, String passport, String phone, String email, String password, String comments) {
		// TODO Auto-generated method stub
		System.out.println("registerOrder " + id_car + day + fio + passport + phone + email + password +  comments);
		long key = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				
				PreparedStatement ps = con.prepareStatement(SQL_INSERT_ORDER, Statement.RETURN_GENERATED_KEYS);
				
				ps.setInt(1, Integer.parseInt(id_car));
				ps.setInt(2, Integer.parseInt(day));
				ps.setString(3, fio);
				ps.setString(4, passport);
				ps.setString(5, phone);
				ps.setString(6, email);
				ps.setString(7, password);
				ps.setString(8, comments);

				System.out.println(ps.toString());
				
				ps.executeUpdate();
				
				
				ResultSet rs = ps.getGeneratedKeys();
				if (rs != null && rs.next()) {
				    key = rs.getLong(1);
				    System.out.println(key);
				}
				

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		
		
		String id_order = "123";

		id_order = Long.toString(key);
		
		return id_order;
	}

	@Override
	public void insertCar(String marka, String year, String transmission, String fuel, String price, String description,
			String url) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				
				PreparedStatement ps = con.prepareStatement(SQL_INSERT_AUTO, Statement.RETURN_GENERATED_KEYS);
				
				ps.setString(1, marka);
				ps.setInt(2, Integer.parseInt(year));
				ps.setString(3, transmission);
				ps.setString(4, fuel);
				ps.setInt(5, Integer.parseInt(price));
				ps.setString(6, description);
				ps.setString(7, url);
				
				ps.executeUpdate();
				
				long key = 0;
				ResultSet rs = ps.getGeneratedKeys();
				if (rs != null && rs.next()) {
				    key = rs.getLong(1);
				    System.out.println(key);
				}
				

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		

		System.out.println("insertCar " + marka + year + transmission + fuel + price + description + url);
		
	}

	@Override
	public void updateCar(String id, String marka, String year, String transmission, String fuel, String price,
			String description, String url) {
		// TODO Auto-generated method stub
		System.out.println("Update");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				
				PreparedStatement ps = con.prepareStatement(SQL_UPDATE_AUTO);
				
				ps.setString(1, marka);
				ps.setInt(2, Integer.parseInt(year));
				ps.setString(3, transmission);
				ps.setString(4, fuel);
				ps.setInt(5, Integer.parseInt(price));
				ps.setString(6, description);
				ps.setString(7, url);
				ps.setInt(8, Integer.parseInt(id));
				
				ps.executeUpdate();


			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}

	}

	@Override
	public void deleteCar(String id) {
		// TODO Auto-generated method stub
		
		System.out.println("Delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				
				PreparedStatement ps = con.prepareStatement(SQL_DELETE_AUTO);
				ps.setInt(1, Integer.parseInt(id));
				ps.executeUpdate();


			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public String loginUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registrationUser(String fio, String passport, String phone, String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> readOrderAll() {
		// TODO Auto-generated method stub
		List<Order> listOrder = new ArrayList();
		/*
		listOrder.add(new Order(1, 2, 20, "Оплачено", "Userfio", "Userpassport", "Userphone", "Useremail", "Usercomments", 
				new Auto(6, 2018, "Ford Fusion", "Автоматическая", "Бензин", 40, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Отличный баланс между мощностью и экономичностью;\r\n" + 
				"			Идеальная управляемость;\r\n" + 
				"			6-ступенчатая автоматическая трансмиссия;\r\n" + 
				"			Анатомические сиденья, высокое качество материалов салона;\r\n" + 
				"			Безупречные параметры активной и пассивной безопасности;\r\n" + 
				"			Управление климатом, круиз-контроль;\r\n" + 
				"			Просторное багажное отделение;\r\n" + 
				"			Акустическая система уровня премиум.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg")));
		
		
		listOrder.add(new Order(1, 2, 20, "Оплачено", "Userfio", "Userpassport", "Userphone", "Useremail", "Usercomments", 
				new Auto(6, 2018, "Ford Fusion", "Автоматическая", "Бензин", 40, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Акустическая система уровня премиум.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg")));
		*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM autopark.`order` t1, autopark.auto t2 where t2.id = t1.id_car");

				while (rs.next()) {
					
					int id = rs.getInt("id");
					int day = rs.getInt("day");
					int total = rs.getInt("total");
					String status = rs.getString("status");
					String fio = rs.getString("fio");
					String passport = rs.getString("passport");
					String phone = rs.getString("phone");
					String email = rs.getString("email");
					String comments = rs.getString("comments");
					
					
					int id_car = rs.getInt("id_car");
					int year = rs.getInt("year");
					String marka = rs.getString("marka");
					String transmission = rs.getString("transmission");
					String fuel = rs.getString("fuel");
					int price = rs.getInt("price");
					String description = rs.getString("description");
					String url = rs.getString("url");
					
					

					Order order = new Order(id, day, total, status, fio, passport, phone, email, comments, new Auto(id_car, year, marka, transmission, fuel, price, description, url));
	

					listOrder.add(order);

					// System.out.println("id: " + id + ", title: " + title);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		return listOrder;
	}

	@Override
	public List<Order> readOrderUser(String emailUser) {
		// TODO Auto-generated method stub
		
		List<Order> listOrder = new ArrayList();
		
		/*
		listOrder.add(new Order(1, 2, 20, "Оплачено", "Userfio", "Userpassport", "Userphone", "Useremail", "Usercomments", 
				new Auto(6, 2018, "Ford Fusion", "Автоматическая", "Бензин", 40, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Акустическая система уровня премиум.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg")));
		
		
		listOrder.add(new Order(1, 2, 20, "Выставлен счет", "Userfio", "Userpassport", "Userphone", "Useremail", "Usercomments", 
				new Auto(6, 2018, "Ford Fusion", "Автоматическая", "Бензин", 40, "Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.\r\n" + 
				"\r\n" + 
				"			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.\r\n" + 
				"			\r\n" + 
				"			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.\r\n" + 
				"			\r\n" + 
				"			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:\r\n" + 
				"			\r\n" + 
				"			Акустическая система уровня премиум.", "http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg")));
		
		*/
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM autopark.`order` t1, autopark.auto t2 where t2.id = t1.id_car and t1.email = '" + emailUser +"'");

				while (rs.next()) {
					
					int id = rs.getInt("id");
					int day = rs.getInt("day");
					int total = rs.getInt("total");
					String status = rs.getString("status");
					String fio = rs.getString("fio");
					String passport = rs.getString("passport");
					String phone = rs.getString("phone");
					String email = rs.getString("email");
					String comments = rs.getString("comments");
					
					
					int id_car = rs.getInt("id_car");
					int year = rs.getInt("year");
					String marka = rs.getString("marka");
					String transmission = rs.getString("transmission");
					String fuel = rs.getString("fuel");
					int price = rs.getInt("price");
					String description = rs.getString("description");
					String url = rs.getString("url");
					
					

					Order order = new Order(id, day, total, status, fio, passport, phone, email, comments, new Auto(id_car, year, marka, transmission, fuel, price, description, url));
	

					listOrder.add(order);

					// System.out.println("id: " + id + ", title: " + title);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		return listOrder;
	}

	@Override
	public String registerPaymentUser(String id_order, String cardnumber, String cardexpiry, String cardcvc, String total) {
		// TODO Auto-generated method stub
		
		return "NO";
	}


}
