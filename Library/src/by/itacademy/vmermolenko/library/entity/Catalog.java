package by.itacademy.vmermolenko.library.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Catalog  {
	
	private String responsiblePerson;
	private Date creationDate;
	
	private List<Book> books;
	
	public Catalog() {
		books = new ArrayList<>();
		
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//Date date = new Date();
		//System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
	}

	public Book searchByName(String title) {

		for (Book book : books) {
			
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		
		return null;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}



	public String getResponsiblePerson() {
		return responsiblePerson;
	}

	public void setResponsiblePerson(String responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<Book> getBooks() {
		return books;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((responsiblePerson == null) ? 0 : responsiblePerson.hashCode());
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
		Catalog other = (Catalog) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (responsiblePerson == null) {
			if (other.responsiblePerson != null)
				return false;
		} else if (!responsiblePerson.equals(other.responsiblePerson))
			return false;
		return true;
	}


	@Override
	public String toString() {

		String res = "";
		for (Book book : books) {
			res += book.getId() + " " + book.getTitle() + "\n";
		}
		
		return res;
	}

	public Book getSingleRow(int row) {
		// TODO Auto-generated method stub
		if (books != null) {
			return books.get(row);
		}
		return null;
	}

	
	
}
