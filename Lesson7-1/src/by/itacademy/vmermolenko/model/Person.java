package by.itacademy.vmermolenko.model;

public abstract class Person {
	
	private String name;
	
	public Person() {
	
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public abstract void work();
	
	public void relax() {
		System.out.println("do Yoga");
	}

}
