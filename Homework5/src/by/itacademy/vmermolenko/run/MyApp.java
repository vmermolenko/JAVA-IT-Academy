package by.itacademy.vmermolenko.run;

import by.itacademy.vmermolenko.model.*;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroundTransportation groundTransportation = new GroundTransportation(2,2,3,3);
		
		
		for (Bus bus : groundTransportation.buses) {
			bus.setWheel(4);
			bus.setWeight(20);
			bus.setPassenger(40);
			bus.setEngine(new Engine("titan", 1000));
			bus.setMaterialWheel("metal");
		}
		
		
	}

}
