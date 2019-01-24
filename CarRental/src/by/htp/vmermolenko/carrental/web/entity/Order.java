package by.htp.vmermolenko.carrental.web.entity;

public class Order {
	
	int id;
	int day;
	int total;
	String status;
	
	String fio;
	String passport;
	String phone;
	String email;
	
	String comments;
	Auto auto;
	
	public Order(int id, int day, int total, String status, String fio, String passport, String phone, String email,
			String comments, Auto auto) {
		super();
		this.id = id;
		this.day = day;
		this.total = total;
		this.status = status;
		this.fio = fio;
		this.passport = passport;
		this.phone = phone;
		this.email = email;
		this.comments = comments;
		this.auto = auto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	
}
