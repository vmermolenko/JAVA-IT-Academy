public class Student {

	int age;
	String fullName;
	boolean isHungry;
	int money;
	float rating;

	public Student() {
		this.age = 18;
		this.fullName = "Неизвестный";
		this.isHungry = true;
		this.money = 5;
		this.rating = 0;
	}
	
	public Student(int age, String fullName, int money, float rating) {
		
		this.age = age;
		this.fullName = fullName;
		this.money = money;
		this.rating = rating;

	}

	public void spendMoney() {
		if (money > 0) {
			money -= 2;
		}

	}

}
