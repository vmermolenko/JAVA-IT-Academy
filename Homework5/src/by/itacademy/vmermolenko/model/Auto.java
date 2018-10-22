package by.itacademy.vmermolenko.model;

public abstract class Auto {
	
	int passenger;
	double weight;
	Engine engine;
	int wheel;
	String materialWheel;
	

	public Auto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Auto(int passenger, double weight, Engine engine, int wheel, String materialWheel) {
		super();
		this.passenger = passenger;
		this.weight = weight;
		this.engine = engine;
		this.wheel = wheel;
		this.materialWheel = materialWheel;
	}



	public abstract void move();
	
	public abstract void info();



	public int getPassenger() {
		return passenger;
	}



	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public Engine getEngine() {
		return engine;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public int getWheel() {
		return wheel;
	}



	public void setWheel(int wheel) {
		this.wheel = wheel;
	}



	public String getMaterialWheel() {
		return materialWheel;
	}



	public void setMaterialWheel(String materialWheel) {
		this.materialWheel = materialWheel;
	}
	
	

}
