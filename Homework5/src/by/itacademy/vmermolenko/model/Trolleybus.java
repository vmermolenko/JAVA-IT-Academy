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


	public Trolleybus(int passenger, double weight, Engine engine, int wheel, String materialWheel,
			double electricityConsumption) {
		super(passenger, weight, engine, wheel, materialWheel);
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
