package by.itacademy.vmermolenko.model;

public class Therapist extends Person {

	public Therapist(String name, float years, double salary) {
		super(name, years, salary);
		// TODO Auto-generated constructor stub
	}

	public Therapist() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("establish a diagnosis");
	}

}
