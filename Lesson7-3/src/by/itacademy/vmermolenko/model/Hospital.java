package by.itacademy.vmermolenko.model;

public class Hospital {
	
	public Person[] persons;
	
	public Hospital() {
		// TODO Auto-generated constructor stub
	}
	
	public Hospital(int count) {
		// TODO Auto-generated constructor stub
		this.persons = new Person[count];
	}


	public void printHospital() {
		for (Person person : persons) {
			
			if (person instanceof Nurse)
			{
				((Nurse) person).sleep();
			}
			
			if (person instanceof Surgeon)
			{
				((Nurse) person).sleep();
			}
			
			if (person.getClass().equals(Surgeon.class))
			{
				((Nurse) person).sleep();
			}
			
			person.work();
		}
	}
}
