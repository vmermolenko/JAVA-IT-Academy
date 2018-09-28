import java.sql.Date;
import java.util.Random;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int x;
		 * 
		 * x = 8;
		 * 
		 * x = 6;
		 * 
		 * int y = 6;
		 * 
		 * int z = x + y;
		 * 
		 * System.out.println(x + y);
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(z); System.out.println(y);
		 * 
		 * System.out.println('c');
		 * 
		 * System.out.printf("%d", x + y);
		 * 
		 * System.out.println("varible 1"); for (int i = 0; i < 10; i++) {
		 * System.out.println(z); }
		 * 
		 * System.out.println("varible 2"); int n = 0; while (n < 10) { n++;
		 * System.out.println(z); }
		 * 
		 * System.out.println("varible 3"); int m = 0; do { m++; System.out.println(z);
		 * 
		 * 
		 * } while (m < 10);
		 * 
		 * System.out.println("varible 4"); System.out.println(x + y);
		 * System.out.println(x + y); System.out.println(x + y); System.out.println(x +
		 * y); System.out.println(x + y); System.out.println(x + y);
		 * System.out.println(x + y); System.out.println(x + y); System.out.println(x +
		 * y); System.out.println(x + y);
		 * 
		 * int[] arr = new int[10];
		 * 
		 * System.out.println("varible 5"); for (int i : arr) { System.out.println(x +
		 * y); }
		 * 
		 * if (x == 10) { System.out.println("x == 10"); } else if (x != 10) {
		 * 
		 * } /
		 * 
		 * for (int i = 9; i > 0; i--) { System.out.println(i); }
		 * 
		 * for (int i = 1; i < 9; i++) { if (i % 2 == 0) { System.out.println(i); } }
		 * 
		 * int mounth = 12;
		 * 
		 * switch (mounth) { case 1: System.out.println("January"); break; case 2:
		 * System.out.println("Febrary"); break; case 3: System.out.println("March");
		 * break; case 4: System.out.println("April"); break; case 5:
		 * System.out.println("May"); break; case 6: System.out.println("June"); break;
		 * case 7: System.out.println("July"); break; case 8:
		 * System.out.println("Aujust"); break; case 9: System.out.println("September");
		 * break; case 10: System.out.println("October"); break; case 11:
		 * System.out.println("November"); break; case 12:
		 * System.out.println("Decemper"); break; }
		 * 
		 * for (int i = 1; i < 100; i++) { if (i % 2 == 0) { System.out.println(i); } }
		 * 
		 * int s = 0; for (int i = 20; i < 200; i++) { s += i; }
		 * 
		 * System.out.println(s); System.out.println(Factorial(5));
		 * 
		 * int m = 25491; int sum = 0;
		 * 
		 * 
		 * 
		 * 
		 * while(m > 0) { if (m % 10 % 2 == 0) { sum += m % 10; }
		 * 
		 * m = m / 10; }
		 * 
		 * System.out.println(sum);
		 */

		int k = 5;

		int[] x = new int[k];

		x[0] = 7;
		x[1] = 3;
		x[2] = 5;
		x[3] = 3;
		x[4] = 6;

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	public static int Factorial(int x) {
		if (x == 0 || x == 1)
			return 1;
		return x * Factorial(x - 1);
	}

}
