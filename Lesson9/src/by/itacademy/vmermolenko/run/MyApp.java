package by.itacademy.vmermolenko.run;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Object();
		
		User us1 = new User("Igor");
		User us2 = new User("Igor");
		User us3 = us1;
		
		System.out.println(us1.equals(us2));
		System.out.println(us1.equals(us3));
		System.out.println(us2.equals(us3));
		
		String str = "a";
		String str1 = "a";
		
		System.out.println(str.equals(str1));
		
		String str2 = new String("a");
		String str3 = new String("b");
		
		String str4 = new String("a");
		String str5 = str4.intern();
		
		
		str3.intern();
		
	}

}


class User {
	
	private String name;

	/**
	 * @param name
	 */
	public User(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
