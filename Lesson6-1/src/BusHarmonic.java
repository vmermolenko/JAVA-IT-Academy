
public class BusHarmonic extends Bus {

	private int countHarmonic;	
	private int countDoor;
	
	public int getCountHarmonic() {
		return countHarmonic;
	}

	public void setCountHarmonic(int countHarmonic) {
		this.countHarmonic = countHarmonic;
	}

	
	public BusHarmonic(String mark, Engine engine, int countWheel, int passengers, int countHarmonic, int countDoor) {
		// TODO Auto-generated constructor stub
		super(mark, engine, countWheel, passengers);
		this.countDoor = countDoor;
		this.countHarmonic = countHarmonic;
		
	}

}
