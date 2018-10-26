package by.itacademy.vmermolenko.model;

public class Metro extends Tram {

	private int countRailwayCarriage;
	
	public Metro() {

	}

	/**
	 * @param passenger
	 * @param ticket
	 * @param speed
	 * @param engine
	 * @param wheel
	 * @param materialWheel
	 * @param wheelMetal
	 * @param electricityConsumption
	 * @param countRailwayCarriage
	 */
	public Metro(int passenger, double ticket, double speed, Engine engine, int wheel, String materialWheel,
			int wheelMetal, double electricityConsumption, int countRailwayCarriage) {
		super(passenger, ticket, speed, engine, wheel, materialWheel, wheelMetal, electricityConsumption);
		this.countRailwayCarriage = countRailwayCarriage;
	}



	public int getCountRailwayCarriage() {
		return countRailwayCarriage;
	}

	public void setCountRailwayCarriage(int countRailwayCarriage) {
		this.countRailwayCarriage = countRailwayCarriage;
	}


	public void info() {
		System.out.println("Metro info");
	}
}
