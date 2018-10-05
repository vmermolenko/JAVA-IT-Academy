import javax.tools.Diagnostic;

public class Receptionist {
	Patient[] patients;

	public Receptionist() {
		// TODO Auto-generated constructor stub
		patients = new Patient[10];
	}

	public Receptionist(int count) {
		// TODO Auto-generated constructor stub
		patients = new Patient[count];
	}

	public void diagnos(String diagnoz) {
		for (Patient patient : patients) {

			if (patient != null) {
				if (patient.diagnosis.equals(diagnoz)) {
					System.out.println("Çהמנמג " + patient.surname);
				}
			}
		}
	}

	public void numMedicine(int start, int end) {

		for (Patient patient : patients) {

			if ((start < patient.numMedicine) && (patient.numMedicine < end)) {
				System.out.println("numMedicine " + patient.numMedicine);
			}
		}
	}
}
