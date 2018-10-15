
public class State {

	String name;
	String nameCapital;
	
	Region[] regions;
	District[] districts;
	City[] cities;
	
	public State() {
		// TODO Auto-generated constructor stub
	}
	
	public State(String nameCapital, int countRegions, int countDistricts, int countCities) {
		// TODO Auto-generated constructor stub
		this.name = nameCapital;
		this.regions = new Region[countRegions];
		this.districts = new District[countDistricts];
		this.cities = new City[countCities];
	}
	
	public void printCapital()
	{
		System.out.println(nameCapital);
	}
	
	public void printName()
	{
		System.out.println(name);
	}
	
	public void printCountRegion()
	{
		System.out.println(name);
	}
	
	
}
