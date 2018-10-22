package by.itacademy.vmermolenko.model;

public class Tram extends Auto{

	private int wheelMetal;
	private double electricityConsumption;
	
	public Tram() {
		
	}

	public Tram(int passenger, double weight, Engine engine, int wheel, String materialWheel, int wheelMetal,
			double electricityConsumption) {
		super(passenger, weight, engine, wheel, materialWheel);
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
