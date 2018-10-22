package by.itacademy.vmermolenko.model;

public class Metro extends Tram {

	private int countRailwayCarriage;

	public Metro() {

	}

	public int getCountRailwayCarriage() {
		return countRailwayCarriage;
	}

	public void setCountRailwayCarriage(int countRailwayCarriage) {
		this.countRailwayCarriage = countRailwayCarriage;
	}

	public Metro(int passenger, double weight, Engine engine, int wheel, String materialWheel, int wheelMetal,
			double electricityConsumption, int countRailwayCarriage) {
		super(passenger, weight, engine, wheel, materialWheel, wheelMetal, electricityConsumption);
		this.countRailwayCarriage = countRailwayCarriage;
	}
	
	public void info() {
		System.out.println("Metro info");
	}
}
