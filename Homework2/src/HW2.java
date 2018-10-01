import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task7();

	}

	// Все элементы массива поделить на значение наибольшего элемента этого массива.
	public static void Task2() {
		double[] x = new double[] { 327, 381, 891, 918, 212, 848, 770, 363, 416, 736 };

		for (int i = 0; i < x.length; i++) {

			System.out.print(" " + x[i]);

		}
		double max = x[0];

		for (int i = 0; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
			}
		}

		System.out.println("");
		System.out.println("max: " + max);

		NumberFormat cf = NumberFormat.getCurrencyInstance();
		for (int i = 0; i < x.length; i++) {

			// DecimalFormat df = new DecimalFormat("#.##");
			// df.format(x[i]/max);

			// System.out.print(" " + df.format(x[i]/max));
			System.out.print(" " + new DecimalFormat("#0.00").format(x[i] / max));
			// System.out.printf(" %s ", cf.format(x[i]/max));

		}
	}

	public static void Task3() {
		double[] x = new double[] { -1.49, 0.50, -4.70, -1.08, -4.95, 1.14, -2.46, 2.61, -3.14, 4.35, 0.52, 1.24, 4.29,
				-2.39, -3.95, -4.91, -4.35, 3.60, 2.50, -0.21 };

		double[] b = new double[20];

		int j = 0;
		for (int i = 0; i < x.length; i++) {

			if (x[i] >= 0) {
				b[j++] = x[i];
			}
		}

		int sum = 0;
		for (int i = 0; i < b.length; i++) {

			if (x[i] >= 0) {
				sum += b[i] * b[i];
			}
		}

		for (int i = 0; i < j; i++) {
			System.out.print(" " + new DecimalFormat("#0.00").format(b[i]));
		}
		System.out.println("");
		System.out.println("sum: " + new DecimalFormat("#0.00").format(sum));
	}

	// Определить принадлежность некоторого значения k интервалам (n, m], [n,m), (n,
	// m), [n, m].
	public static void Task4() {
		int k = 1, n = 1, m = 123;
		if (n < k && k <= m) {
			System.out.println("(n, m]");
		}

		if (n <= k && k < m) {
			System.out.println("[n, m)");
		}

		if (n < k && k < m) {
			System.out.println("(n, m)");
		}
		if (n <= k && k <= m) {
			System.out.println("[n, m]");
		}
	}

	// Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
	public static void Task5() {

		int k = 15, n = 4;
		int count = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (count <= k)
					System.out.print(count++ + " ");
			}
			System.out.println();
		}

	}

	// Найти корни квадратного уравнения. Параметры уравнения передавать
	// с командной строкой.

	public static void Task6() {

		char chTemp = 'a';
		do {

			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("A*x*x + B*x + C = 0");
				System.out.println("Введите коэффициенты A");
				int a = sc.nextInt();
				System.out.println("Введите коэффициенты B");
				int b = sc.nextInt();
				System.out.println("Введите коэффициенты C");
				int c = sc.nextInt();
				System.out.println(" X ");

				if (b * b - 4 * a * c >= 0) {
					double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

					System.out.println("x1: " + x1);
					System.out.println("x2: " + x2);
				} else {
					System.out.println("Дискриминант меньше нуля");
				}

				System.out.println("Клавиша 'q' Выход");
				chTemp = sc.next().charAt(0);
			} catch (Exception e) {
				// TODO: handle exception
				// System.out.println(e.getMessage().toString());
			}

		} while (chTemp != 'q');

		System.out.println("Exit");

	}

	public static void Task7() {
		int mounth = 0;

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите номер месяца");
			mounth = sc.nextInt();
		}catch (Exception e) {
			// TODO: handle exception
			mounth = 0;
		}
		
		switch (mounth) {
		case 0:
			System.out.println("Введите число месяца");
			break;
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febrary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aujust");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("Decemper");
			break;
		}
	}
}
