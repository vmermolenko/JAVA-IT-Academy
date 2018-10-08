/**
 * House: id, ����� ��������, �������, ����, ���������� ������, �����,
��� ������, ���� ������������.
������� ������ ��������. �������:
a) ������ �������, ������� �������� ����� ������;
b) ������ �������, ������� �������� ����� ������ � �������������
�� �����, ������� ��������� � �������� ����������;
c) ������ �������, ������� �������, ������������� ��������.

int id;
int numFlat;
double areaFlat;
int floor;
int room;
String street;
String buildingType;
float lifetime;
*/


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House[] listHouse  = new House[5];
		
		listHouse[0] = new House(1,11,10,1,1,"������������� 5", "������������� ���", 5f);
		listHouse[1] = new House(2,125,20,3,1,"������������� 15", "������������� ���", 5f);
		listHouse[2] = new House(3,210,100,5,2,"������������� 25", "������������� ���", 5f);
		listHouse[3] = new House(4,211,200,8,3,"������������� 35", "������������� ���", 5f);
		listHouse[4] = new House(5,212,300,11,3,"������������� 45", "������������� ���", 5f);

		int p_room = 1;
		
		System.out.println("a) ������ �������, ������� �������� ����� ������;");
		for (House house : listHouse) {
			if (house.room == p_room)
			{
				System.out.println("����� ��������: " + house.numFlat);
			}
		}
		
		int floor_start = 1;
		int floor_end = 5;
		System.out.println("b) ������ �������, ������� �������� ����� ������ � �������������\r\n" + 
				"�� �����, ������� ��������� � �������� ����������;");
		for (House house : listHouse) {
			if ((house.room == p_room) && (house.floor >= floor_start) && (house.floor <= floor_end))
			{
				System.out.println("����� ��������: " + house.numFlat);
			}
		}
		
		double p_areaFlat = 200;
		System.out.println("c) ������ �������, ������� �������, ������������� ��������.");
		for (House house : listHouse) {
			if (house.areaFlat >= p_areaFlat)
			{
				System.out.println("����� ��������: " + house.numFlat);
			}
		}
	}

}
