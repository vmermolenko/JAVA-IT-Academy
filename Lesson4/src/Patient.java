/*
Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
карты, Диагноз.
Создать массив объектов. Вывести:
a) список пациентов, имеющих данный диагноз;

b) список пациентов, номер медицинской карты которых находится в за-
данном интервале.
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
