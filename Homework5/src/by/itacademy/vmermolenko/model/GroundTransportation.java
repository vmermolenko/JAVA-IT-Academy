package by.itacademy.vmermolenko.model;

public class GroundTransportation {
	
	public Auto[] autos;
	
	public GroundTransportation(int countAutos) {
		this.autos = new Auto[countAutos];
	}
	
	public void info()
	{
		System.out.println("info");
		
		for (int i = 0; i < autos.length; i++) {
			System.out.println(autos[i].getTicket());
		} 
	}
	
	 public void Sort() {
		 
		 
		 for (int i = 0; i < autos.length; i++) {
		
			 for (int j = 0; j < autos.length; j++) {
				 
				if (autos[i].getTicket() < autos[j].getTicket() )
				{
					Auto tmp = autos[i];
					autos[i] = autos[j];
					autos[j] = tmp;
				}
			}
		}
	 }
}