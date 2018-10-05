
public class MainHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient[] arr = new Patient[7];
		arr[0] = new Patient(1, "Иванов", "Иван", "Иванович", "Независимости 95", "+375292502551", 1, "Здоров");
		arr[1] = new Patient(1, "Петров", "Иван", "Иванович", "Независимости 95", "+375292502552", 3, "Болен");
		arr[2] = new Patient(1, "Сидоров", "Иван", "Иванович", "Независимости 95", "+375292502553", 4, "Здоров");
		arr[3] = new Patient(1, "Пупкин", "Иван", "Иванович", "Независимости 95", "+375292502554", 5, "Здоров");
		arr[4] = new Patient(1, "Неизвестный", "Иван", "Иванович", "Независимости 95", "+375292502550", 2, "Здоров");
		arr[5] = new Patient(1, "Неизвестный", "Иван", "Иванович", "Независимости 95", "+375292502550", 6, "Болен");
		arr[6] = new Patient(1, "Неизвестный", "Иван", "Иванович", "Независимости 95", "+375292502550", 8, "Болен");
		
		Receptionist receptionist = new Receptionist();
		receptionist.patients = arr;
		receptionist.diagnos("Здоров");
		receptionist.numMedicine(1, 4);

	}

}
