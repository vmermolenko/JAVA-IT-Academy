package by.itacademy.vmermolenko.model;

public class Engine {
	
	private String model;
	private double power;
	
	public Engine() {

	}

	public Engine(String model, double power) {
		super();
		this.model = model;
		this.power = power;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
}
