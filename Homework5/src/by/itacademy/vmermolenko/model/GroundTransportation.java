package by.itacademy.vmermolenko.model;

public class GroundTransportation {
	
	public Bus[] buses;
	public Tram[] trames;
	public Trolleybus[] trolleybus;
	public Metro[] subwayTrain;
	
	public GroundTransportation(int countBuses, int countTrames, int countTrolleybus, int countSubwayTrain) {
		super();
		this.buses = new Bus[countBuses];
		this.trames = new Tram[countTrames];
		this.trolleybus = new Trolleybus[countTrolleybus];
		this.subwayTrain = new Metro[countSubwayTrain];
	}
	
	public void info()
	{
		System.out.println("buses: " + buses.length + " trames: " + trames.length + " trolleybus: "+ trolleybus.length + " subwayTrain:" +subwayTrain.length );
	}
}
