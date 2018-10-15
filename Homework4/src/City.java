
public class City {

	String name;
	String status;

	public City() {
		// TODO Auto-generated constructor stub
	}

	public City(String name, String status) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.status = status;
	}

	public void printName() {
		System.out.println(name + " " + status);
	}
}
