package by.htp.library.entity;

public class Book {
	
	private int id;
	private String title;

	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String title) {
		this.id = id;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}
	
	
}
