package by.itacademy.vmermolenko.run;

import by.itacademy.vmermolenko.model.*;

public class MainPersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.relax();
		student.work();

		Professor professor = new Professor();
		professor.relax();
		professor.work();

		Assistant assistant = new Assistant();
		assistant.relax();
		assistant.work();

		Person[] persons = new Person[5];
		persons[0] = new Student();
		persons[1] = new Assistant();
		persons[2] = new Professor();
		persons[3] = new Student();
		persons[4] = new Assistant();

		System.out.println("=========================");
		
		for (Person person : persons) {
			person.relax();
			person.work();
			
			
		}
	}

}
