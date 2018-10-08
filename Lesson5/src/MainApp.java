import java.util.Random;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 * @author user
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		random.nextDouble();
			
		Car[] listCar = new Car[5];
		for (int i = 0; i < listCar.length; i++) {
			
			
			Engine engine = new Engine(random.nextFloat() * 100);

			listCar[i] = new Car(engine, random.nextInt(10));
						
			Wheel[] wheel = new Wheel[listCar[i].wheel.length];
			
			
			
			for (int j = 0; j < wheel.length; j++) {
				
				wheel[j] = new Wheel(22.5f, random.nextFloat() + 22f);
				
				listCar[i].wheel[j] = wheel[j];
			}
		}
		
		listCar[0].brand = "Lamborghini";
		listCar[1].brand = "Porshe";
		listCar[2].brand = "Mitsubishi";
		listCar[3].brand = "BMW";
		listCar[4].brand = "Mercedes-Benz";	
		
		
		AutoPark autoPark = new AutoPark(listCar);
		autoPark.displayBrand();
		System.out.println("");
		System.out.println("Autopark");
		System.out.println("");
		autoPark.changeWheel();
		autoPark.displayBrand();
		
		
	}

}
