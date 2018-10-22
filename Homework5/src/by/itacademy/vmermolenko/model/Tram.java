package by.itacademy.vmermolenko.model;

public class Tram extends Auto{

	private int wheelMetal;
	private double electricityConsumption;
	
	public Tram() {
		
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
	 */
	public Tram(int passenger, double ticket, double speed, Engine engine, int wheel, String materialWheel,
			int wheelMetal, double electricityConsumption) {
		super(passenger, ticket, speed, engine, wheel, materialWheel);
		this.wheelMetal = wheelMetal;
		this.electricityConsumption = electricityConsumption;
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	public int getWheelMetal() {
		return wheelMetal;
	}

	public void setWheelMetal(int wheelMetal) {
		this.wheelMetal = wheelMetal;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	public double getElectricityConsumption() {
		return electricityConsumption;
	}

	public void setElectricityConsumption(double electricityConsumption) {
		this.electricityConsumption = electricityConsumption;
	}

	
}
