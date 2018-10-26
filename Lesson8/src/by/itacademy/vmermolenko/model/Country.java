package by.itacademy.vmermolenko.model;

public class Country {

	private LibraryService[] libraries;
	private int count = 0;

	public Country() {
		libraries = new BookService[5];

	}

	public void addNewLibrary(BookService bookService) {

		if (bookService != null) {
			libraries[count] = bookService;
			count++;
		}
	}

	public void printAllBooks() {

		for (LibraryService bs : libraries) {

			if (bs != null) {

				System.out.println(bs.getBookCatalog().toString());
			}
		}
	}

	public void printAllReadingCitizens() {
		for (LibraryService ls : libraries) {
			if (ls != null) {

				if (ls.getReader() !=null) {
					System.out.println(ls.getReader().toString());
				}else {
					System.out.println("No readers for such library type");
				}
				
			}
		}
	}

}
