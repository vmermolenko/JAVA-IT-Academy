import java.util.Scanner;

public class ScannerUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char chTemp = 'a';
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("¬ведите значение" );

			chTemp = sc.next().charAt(0);
		}
		while (chTemp != 'q');
		
		System.out.println("Exit");
		
		
	}

}
