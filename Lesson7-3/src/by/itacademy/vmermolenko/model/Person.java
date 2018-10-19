package by.itacademy.vmermolenko.model;

public abstract class Person {
	
	private String name;
	private float years;
	private double salary;
	/**
	 * @param name
	 * @param years
	 * @param salary
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, float years, double salary) {
		super();
		this.name = name;
		this.years = years;
		this.salary = salary;
	}	
	
	public abstract void work();
	
}
