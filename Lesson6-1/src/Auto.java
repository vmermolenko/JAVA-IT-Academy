
public class Auto {

	private String mark;
	private Engine engine;
	private String color;
	public Wheel[] wheels;
	
	

	public Auto() {
		// TODO Auto-generated constructor stub
		System.out.println("Auto()");
		
	}

	public Auto(String mark, Engine engine, int countWheel) {
		// TODO Auto-generated constructor stub
		System.out.println("Auto(,)");
		this.mark = mark;
		this.engine = engine;
		this.color = "white";
		this.wheels = new Wheel[countWheel];
	}

	public String getMark() {

		return this.mark;
	}
	
	public String getColor() {
		return color;
	}

	public Engine getEngine() {

		return this.engine;
	}

	public void setEngine(Engine engine) {

		this.engine = engine;
	}

	public void upgrade(Engine engine, String color) {
		// null
		if (engine.getVolume() > this.engine.getVolume()) {
			this.engine = engine;
		}

		if (!color.equals("white")) {
			this.color = color;
		}
	}

	public int getCountWheel()
	{
		return this.wheels.length;
	}
	
	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

}
