package by.htp.vmermolenko.carrental.web.entity;

public class Auto {
	
	int id;
	int year;
	String marka;
	String transmission;
	String fuel;
	int price;
	String description;
	String url;
	
	public Auto(int year, String marka, String transmission, String fuel, int price, String description, String url) {
		super();
		this.year = year;
		this.marka = marka;
		this.transmission = transmission;
		this.fuel = fuel;
		this.price = price;
		this.description = description;
		this.url = url;
	}

	public Auto(int id, int year, String marka, String transmission, String fuel, int price, String description,
			String url) {
		super();
		this.id = id;
		this.year = year;
		this.marka = marka;
		this.transmission = transmission;
		this.fuel = fuel;
		this.price = price;
		this.description = description;
		this.url = url;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Auto [id=" + id + ", year=" + year + ", marka=" + marka + ", transmission=" + transmission + ", fuel="
				+ fuel + ", price=" + price + ", description=" + description + ", url=" + url + "]";
	}
	
}
