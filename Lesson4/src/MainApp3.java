import java.util.Iterator;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient[] arr = new Patient[5];
		arr[0] = new Patient(1, "Иванов", "Иван", "Иванович", "Независимости 95", "+375292502551", 1 , "Здоров");
		arr[1] = new Patient(1, "Петров", "Иван", "Иванович", "Независимости 95", "+375292502552", 3, "Здоров");
		arr[2] = new Patient(1, "Сидоров", "Иван", "Иванович", "Независимости 95", "+375292502553", 4, "Здоров");
		arr[3] = new Patient(1, "Пупкин", "Иван", "Иванович", "Независимости 95", "+375292502554", 5, "Здоров");
		arr[4] = new Patient(1, "Неизвестный", "Иван", "Иванович", "Независимости 95", "+375292502550", 6, "Болен");
		
		for (Patient patient : arr) {
			
			if (patient.diagnosis.equals("Здоров"))
			{
				System.out.println("Здоров " + patient.surname);
			}
		}
		
		for (Patient patient : arr) {
			
			if (patient.numMedicine > 4)
			{
				System.out.println("numMedicine " + patient.numMedicine);
			}
		}
	}

}
