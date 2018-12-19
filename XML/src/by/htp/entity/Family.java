package by.htp.entity;

public class Family {
	private Mother mother;
	private String address;
	
	public Family(Mother mother, String address) {
		this.mother = mother;
		this.address = address;
	}
	public Family() {
		// TODO Auto-generated constructor stub
	}
	public Mother getMother() {
		return mother;
	}
	public void setMother(Mother mother) {
		this.mother = mother;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Family [mother=" + mother + ", address=" + address + "]";
	}

	
	
}
