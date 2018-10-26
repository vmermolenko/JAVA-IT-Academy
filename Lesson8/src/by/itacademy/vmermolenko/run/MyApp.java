package by.itacademy.vmermolenko.run;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.vmermolenko.model.*;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country belarus = new Country();
		belarus.addNewLibrary(new ChildLibrary());
		belarus.addNewLibrary(new TechLibrary());
		
		belarus.printAllBooks();
		
		String str = "Hello";
		
		List books1 = new ArrayList();
		books1.add(new Book("1"));
		books1.add(new Book("2"));
		System.out.println(books1.size());
		
		
		List books2 = new BookArrayList();
		books2.add(new Book("1"));
		books2.add(new Book("2"));
		System.out.println(books2.size());
		
		
	}

}
