
public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHello(); 
		printHelloUser("EWM"); 
		sum(3,5);
		
	
	}
	
	static int sum(int x, int y)
	{
		int c = x + y;
		return c;
	}
	
	static void printHello() {
		System.out.println("Hello World!");	
	}
	
	static void printHelloUser(String userName) {
		
		System.out.println("Hello " + userName);	
	}

	
}
