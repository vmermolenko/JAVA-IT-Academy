/**
 *  * House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица,
	Тип здания, Срок эксплуатации.
 * @author vmermolenko
 *
 */
public class House {
	int id;
	int numFlat;
	double areaFlat;
	int floor;
	int room;
	String street;
	String buildingType;
	float lifetime;
	
	public House()
	{
		
	}
	
	public House(int id, 
				 int numFlat, 
				 double areaFlat, 
				 int floor, 
				 int room,	
				 String street,	
				 String buildingType, 
				 float lifetime)
	{
		this.id = id;
		this.numFlat = numFlat;
		this.areaFlat = areaFlat;
		this.floor = floor;
		this.room = room;
		this.street = street;
		this.buildingType = buildingType;
		this.lifetime = lifetime;
	}

}
