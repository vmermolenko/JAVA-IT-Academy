package by.itacademy.vmermolenko.serialize.model;

import java.io.Serializable;

public class Address implements Serializable {
	private String mainAddress;

	public Address(String mainAddress) {
		super();
		this.mainAddress = mainAddress;
	}

	@Override
	public String toString() {
		return "Address [mainAddress=" + mainAddress + "]";
	}

}
