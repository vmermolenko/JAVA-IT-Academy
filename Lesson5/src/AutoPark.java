
public class AutoPark {
	Car[] listCar;

	public AutoPark() {
		// TODO Auto-generated constructor stub
	}

	public AutoPark(Car[] listCar) {
		// TODO Auto-generated constructor stub
		this.listCar = listCar;
	}

	public void displayBrand() {
		// TODO Auto-generated constructor stub
		for (Car car : listCar) {
			System.out.println(car.brand + " " + car.wheel.length );
			for (int i = 0; i < car.wheel.length; i++) {
				System.out.println("   " + i +  " radius:" + car.wheel[i].radius + " pressure: " + car.wheel[i].pressure );
			}
			
		}
	}

	public void changeWheel() {

		for (int i = 0; i < listCar.length; i++) {

			for (int j = 0; j < listCar[i].wheel.length; j++) {
				
				if (listCar[i].wheel[j].pressure < 22.5f)
				{
					listCar[i].wheel[j] = new Wheel(20f, 23f);
				}
			}
			
		}
	}

}
