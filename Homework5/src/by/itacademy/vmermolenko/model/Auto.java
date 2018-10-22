package by.itacademy.vmermolenko.model;

public abstract class Auto {
	
	int passenger;
	double ticket;
	double speed;
	Engine engine;
	int wheel;
	String materialWheel;
	

	public Auto() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param passenger
	 * @param ticket
	 * @param speed
	 * @param engine
	 * @param wheel
	 * @param materialWheel
	 */
	public Auto(int passenger, double ticket, double speed, Engine engine, int wheel, String materialWheel) {
		super();
		this.passenger = passenger;
		this.ticket = ticket;
		this.speed = speed;
		this.engine = engine;
		this.wheel = wheel;
		this.materialWheel = materialWheel;
	}





	public double getSpeed() {
		return speed;
	}





	public void setSpeed(double speed) {
		this.speed = speed;
	}





	public abstract void move();
	
	public abstract void info();



	public int getPassenger() {
		return passenger;
	}



	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}



	public double getTicket() {
		return ticket;
	}



	public void setTicket(double ticket) {
		this.ticket = ticket;
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
