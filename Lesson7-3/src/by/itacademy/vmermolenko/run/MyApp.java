package by.itacademy.vmermolenko.run;

import by.itacademy.vmermolenko.model.*;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital hospital = new Hospital(5);
		
		hospital.persons[0] = new Nurse();
		hospital.persons[1] = new Therapist();
		hospital.persons[2] = new Nurse();
		hospital.persons[3] = new Nurse();
		hospital.persons[4] = new Surgeon();
		
		hospital.printHospital();
	}

}
