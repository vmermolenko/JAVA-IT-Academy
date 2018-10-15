
public class Truck extends Auto {

	private int cargo;

	public Truck() {	
		// TODO Auto-generated constructor stub
		super("gaz", new Engine(2.0f), 4);
		System.out.println("Truck()");
	
	}
	
	public Truck(String mark, Engine engine, int countWheel) {	
		// TODO Auto-generated constructor stub
		super("gaz", new Engine(2.0f), countWheel);
		System.out.println("Truck()");
	
	}
	
	
	public Truck(int cargo) {
		super();
		this.cargo = cargo;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	
}
