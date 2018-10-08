
public class Car {

	double volumeTank;

	String brand;
	Engine engine;
	Wheel[] wheel;
	boolean isMove = false;
	boolean refuel = true;
	boolean changeWheel = false;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brand) {
		this.brand = brand;
	}

	public Car(Engine engine, int countWheel) {
		this.engine = engine;
		this.wheel = new Wheel[countWheel];
	}
	

	public void move() {
		System.out.println("move");
	}

	public void refuel() {
		System.out.println("refuel");
	}

	public void changeWheel(Wheel wheel, int numWheel) {

		if (wheel.radius == this.wheel[numWheel].radius) {
			this.wheel[numWheel] = wheel;
			System.out.println("change wheel " + numWheel);
		} else
		{
			System.out.println("impossible change wheel");
		}

	}

	public void displayBrand() {
		System.out.println(this.brand);
	}
}
