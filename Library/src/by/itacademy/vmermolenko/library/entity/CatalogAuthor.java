package by.itacademy.vmermolenko.library.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CatalogAuthor {
	
	private String responsiblePerson;
	private Date creationDate;
	
	List<Author> list;

	public CatalogAuthor() {
		
		this.list = new ArrayList<>();
	}
	
	public Author getAuthor(int index)
	{
		for (Author author : list) {
			if (author.id == index) {
				return author;
			}
		}

		return null;
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

	public List<Author> getList() {
		return list;
	}

	public void setList(List<Author> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
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
		CatalogAuthor other = (CatalogAuthor) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
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
		return "CatalogAuthor [responsiblePerson=" + responsiblePerson + ", creationDate=" + creationDate + ", list="
				+ list + "]";
	}
		
}
