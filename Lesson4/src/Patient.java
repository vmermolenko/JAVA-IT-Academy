/*
Patient: id, �������, ���, ��������, �����, �������, ����� �����������
�����, �������.
������� ������ ��������. �������:
a) ������ ���������, ������� ������ �������;

b) ������ ���������, ����� ����������� ����� ������� ��������� � ��-
������ ���������.
*/
public class Patient {
	int id;
	String surname;
	String name;
	String lastname;
	String address;
	String phone;
	int numMedicine;
	String diagnosis;
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	public Patient(int id,	String surname,	String name, String lastname, String address, String phone, int numMedicine,	String diagnosis) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.numMedicine = numMedicine;
		this.diagnosis = diagnosis;
	}
}
