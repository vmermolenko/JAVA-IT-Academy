
public class MainHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient[] arr = new Patient[7];
		arr[0] = new Patient(1, "������", "����", "��������", "������������� 95", "+375292502551", 1, "������");
		arr[1] = new Patient(1, "������", "����", "��������", "������������� 95", "+375292502552", 3, "�����");
		arr[2] = new Patient(1, "�������", "����", "��������", "������������� 95", "+375292502553", 4, "������");
		arr[3] = new Patient(1, "������", "����", "��������", "������������� 95", "+375292502554", 5, "������");
		arr[4] = new Patient(1, "�����������", "����", "��������", "������������� 95", "+375292502550", 2, "������");
		arr[5] = new Patient(1, "�����������", "����", "��������", "������������� 95", "+375292502550", 6, "�����");
		arr[6] = new Patient(1, "�����������", "����", "��������", "������������� 95", "+375292502550", 8, "�����");
		
		Receptionist receptionist = new Receptionist();
		receptionist.patients = arr;
		receptionist.diagnos("������");
		receptionist.numMedicine(1, 4);

	}

}
