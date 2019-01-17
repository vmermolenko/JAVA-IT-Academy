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
		
		
		return listAuto;
	}

	@Override
	public void registerOrder(String id_car, String day, String fio, String passport, String phone, String email, String comments) {
		// TODO Auto-generated method stub
		System.out.println("registerOrder " + id_car + day + fio + passport + phone + email + comments);
	}

	@Override
	public void insertCar(String marka, String year, String transmission, String fuel, String price, String description,
			String url) {
		// TODO Auto-generated method stub
		System.out.println("insertCar " + marka + year + transmission + fuel + price + description + url);
		
	}

	@Override
	public void updateCar(String id, String marka, String year, String transmission, String fuel, String price,
			String description, String url) {
		// TODO Auto-generated method stub
		System.out.println("updateCar " + id + marka + year + transmission + fuel + price + description + url);
	}

	@Override
	public void deleteCar(String id) {
		// TODO Auto-generated method stub
		System.out.println("deleteCar " + id );
		
	}
}
