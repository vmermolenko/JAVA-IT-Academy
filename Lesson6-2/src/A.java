
public class A {
	
	String value;

	public A() {
		// TODO Auto-generated constructor stub
		this("Hello world");
		
	}
	
	public A(String value) {
		// TODO Auto-generated constructor stub
		System.out.println("A(,)");
		this.value = value;
	}

	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
