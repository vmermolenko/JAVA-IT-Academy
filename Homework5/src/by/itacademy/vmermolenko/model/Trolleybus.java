package by.itacademy.vmermolenko.model;

public class Trolleybus extends Auto{

	private double electricityConsumption;
	
	
	public Trolleybus() {
		
	}
	
	public double getElectricityConsumption() {
		return electricityConsumption;
	}

	public void setElectricityConsumption(double electricityConsumption) {
		this.electricityConsumption = electricityConsumption;
	}

	public Trolleybus(double electricityConsumption) {
		super();
		this.electricityConsumption = electricityConsumption;
	}



	
	/**
	 * @param passenger
	 * @param ticket
	 * @param speed
	 * @param engine
	 * @param wheel
	 * @param materialWheel
	 * @param electricityConsumption
	 */
	public Trolleybus(int passenger, double ticket, double speed, Engine engine, int wheel, String materialWheel,
			double electricityConsumption) {
		super(passenger, ticket, speed, engine, wheel, materialWheel);
		this.electricityConsumption = electricityConsumption;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	
}
