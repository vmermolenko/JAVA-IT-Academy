package by.itacademy.vmermolenko.serialize.model;

import java.io.Serializable;

public class User implements Serializable {
	
	public static int id;
	public final static int year = 2018;
	
	private String name;
	private Address address;

	public User(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		if (address != null) {
			return "User [name=" + name + id + year + ", address=" + address + "]";
		} else {
			return "User [name=" + name + "]";
		}
	}

}