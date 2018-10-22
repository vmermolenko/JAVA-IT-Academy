package by.itacademy.vmermolenko.run;

import by.itacademy.vmermolenko.model.*;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		public Bus[] buses;
		public Tram[] trames;
		public Trolleybus[] trolleybus;
		public Metro[] subwayTrain;
		*/
		GroundTransportation groundTransportation = new GroundTransportation(4);
		
		groundTransportation.autos[0] = new Bus(40, 10,  40, new Engine("titan", 1000), 10, "metal", 10);
		
		groundTransportation.autos[1] = new Tram(10, 15, 10, new Engine("zubr", 1000), 10, "metal", 10, 100);

		groundTransportation.autos[2] = new Trolleybus(40, 14, 11, new Engine("zubr", 1000), 10, "litii", 1000);
		
		groundTransportation.autos[3] = new Metro(40, 11, 10, new Engine("zubr", 1000), 10, "metal", 100, 100, 100);
		
		
		
		for (Auto auto : groundTransportation.autos) {
					
			System.out.println(auto.getClass() + " Ticket:" + auto.getTicket() + " Speed:" + auto.getSpeed());

		}
		
		
		groundTransportation.info();
		groundTransportation.Sort();
		groundTransportation.info();
		
		//groundTransportation.Sort(groundTransportation.autos);
		
		
	}

}
