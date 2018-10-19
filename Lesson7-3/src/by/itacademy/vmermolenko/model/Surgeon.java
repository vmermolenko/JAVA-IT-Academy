package by.itacademy.vmermolenko.model;

public class Surgeon extends Person{

	public Surgeon(String name, float years, double salary) {
		super(name, years, salary);
		// TODO Auto-generated constructor stub
	}

	public Surgeon() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("do operation");
	}

}
