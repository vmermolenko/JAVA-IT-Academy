import java.util.Iterator;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient[] arr = new Patient[5];
		arr[0] = new Patient(1, "������", "����", "��������", "������������� 95", "+375292502551", 1 , "������");
		arr[1] = new Patient(1, "������", "����", "��������", "������������� 95", "+375292502552", 3, "������");
		arr[2] = new Patient(1, "�������", "����", "��������", "������������� 95", "+375292502553", 4, "������");
		arr[3] = new Patient(1, "������", "����", "��������", "������������� 95", "+375292502554", 5, "������");
		arr[4] = new Patient(1, "�����������", "����", "��������", "������������� 95", "+375292502550", 6, "�����");
		
		for (Patient patient : arr) {
			
			if (patient.diagnosis.equals("������"))
			{
				System.out.println("������ " + patient.surname);
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
