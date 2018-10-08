/**
 * House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица,
Тип здания, Срок эксплуатации.
Создать массив объектов. Вывести:
a) список квартир, имеющих заданное число комнат;
b) список квартир, имеющих заданное число комнат и расположенных
на этаже, который находится в заданном промежутке;
c) список квартир, имеющих площадь, превосходящую заданную.

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
		
		listHouse[0] = new House(1,11,10,1,1,"Независимости 5", "Многоэтажэный дом", 5f);
		listHouse[1] = new House(2,125,20,3,1,"Независимости 15", "Многоэтажэный дом", 5f);
		listHouse[2] = new House(3,210,100,5,2,"Независимости 25", "Многоэтажэный дом", 5f);
		listHouse[3] = new House(4,211,200,8,3,"Независимости 35", "Многоэтажэный дом", 5f);
		listHouse[4] = new House(5,212,300,11,3,"Независимости 45", "Многоэтажэный дом", 5f);

		int p_room = 1;
		
		System.out.println("a) список квартир, имеющих заданное число комнат;");
		for (House house : listHouse) {
			if (house.room == p_room)
			{
				System.out.println("Номер квартиры: " + house.numFlat);
			}
		}
		
		int floor_start = 1;
		int floor_end = 5;
		System.out.println("b) список квартир, имеющих заданное число комнат и расположенных\r\n" + 
				"на этаже, который находится в заданном промежутке;");
		for (House house : listHouse) {
			if ((house.room == p_room) && (house.floor >= floor_start) && (house.floor <= floor_end))
			{
				System.out.println("Номер квартиры: " + house.numFlat);
			}
		}
		
		double p_areaFlat = 200;
		System.out.println("c) список квартир, имеющих площадь, превосходящую заданную.");
		for (House house : listHouse) {
			if (house.areaFlat >= p_areaFlat)
			{
				System.out.println("Номер квартиры: " + house.numFlat);
			}
		}
	}

}
