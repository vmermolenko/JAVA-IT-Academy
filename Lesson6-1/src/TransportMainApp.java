
public class TransportMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Auto auto = new Auto("fiat", new Engine(1.4f));
		
		auto.setEngine(new Engine(1.6f));
		
		System.out.println(auto.getMark() + ", " + auto.getEngine().getVolume() + ", " + auto.getColor());

		auto.upgrade(new Engine(1.8f), "black");
		
		System.out.println(auto.getMark() + ", " + auto.getEngine().getVolume() + ", " + auto.getColor());
		
		String s = "a";
		*/
		System.out.println("");
		
		Truck truck = new Truck();
		
		Bus bus = new Bus();
		
		System.out.println("");
		
		
		BusHarmonic busHarmonic = new BusHarmonic("BusHarmonic", new Engine(2.0f), 8, 150, 40, 4);
		
		Wheel[] wheels = new Wheel[8];

		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel(1.8f, 2.6f);
		}
		
		busHarmonic.setWheels(wheels);
		
		busHarmonic.getCountWheel();
		
		System.out.println(busHarmonic.getCountWheel());
		
		
		for (Wheel wheel : busHarmonic.wheels) {
			
			System.out.println(wheel.radius + " " + wheel.pressure);
			
		}
	}

}
