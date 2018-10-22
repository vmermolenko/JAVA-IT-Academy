package by.itacademy.vmermolenko.model;

public class Bus extends Auto{

	private int fuelConsumption;
	
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}


	public Bus(int passenger, double weight, Engine engine, int wheel, String materialWheel, int fuelConsumption) {
		super(passenger, weight, engine, wheel, materialWheel);
		this.fuelConsumption = fuelConsumption;
	}


	public int getFuelConsumption() {
		return fuelConsumption;
	}


	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}


	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}
	
}
