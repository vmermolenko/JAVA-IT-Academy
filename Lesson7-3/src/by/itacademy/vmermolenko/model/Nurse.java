package by.itacademy.vmermolenko.model;

public class Nurse extends Person {

	public Nurse(String name, float years, double salary) {
		super(name, years, salary);
		// TODO Auto-generated constructor stub
	}

	public Nurse() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("do an injection");
	}
	
	public void sleep() {
		System.out.println(" sleep 2 hours");
	}
	


}
