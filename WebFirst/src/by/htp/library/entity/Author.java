package by.htp.library.entity;

public class Author {
	int id;
	String name;
	int day;
	int month;
	int year;
	
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	public Author(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}


	public Author(int id, String name, int day, int month, int year) {
		super();
		this.id = id;
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + id;
		result = prime * result + month;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
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
		Author other = (Author) obj;
		if (day != other.day)
			return false;
		if (id != other.id)
			return false;
		if (month != other.month)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
