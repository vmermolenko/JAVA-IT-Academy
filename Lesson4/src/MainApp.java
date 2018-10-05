
public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.age = 16;
		st1.fullName = "Петров";
		
		st2.age = 23;
		st2.fullName = "Сидоров";
		st2.isHungry = true;
		
		Student st3 = st2;
		
		st3.age = 18;
		st2.age = 19;
		
		
		Mother mother = new Mother();
		
		mother.feedStudent(st2);
		
		
		
		System.out.println("");	
	}
}
