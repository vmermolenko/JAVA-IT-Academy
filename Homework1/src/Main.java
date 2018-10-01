import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task14();
	}

	// 1. ��������� ������ x ������ ������� � ������� ���������� ������� x �� �����
	public static void Task1() {
		Random random = new Random();
		int value = random.nextInt(50);
		System.out.println("Array :" + value);
		int[] list = new int[value];

		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(50);
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(i + ": " + list[i]);
		}
	}

	// 2. ������� ���������� ������� x �� ������� 1 �� ����� � �������� �������
	public static void Task2() {
		Random random = new Random();
		int value = random.nextInt(50);
		System.out.println("Array :" + value);
		int[] list = new int[value];

		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(50);
		}

		for (int i = list.length - 1; i >= 0; i--) {
			System.out.println(i + ": " + list[i]);
		}
	}

	// 3. ��������� ������ �������� �� 100 ��������� ���������� ������ �������
	public static void Task3() {
		Random random = new Random();
		int value = 100;
		System.out.println("Array :" + value);
		int[] list = new int[value];

		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(50);
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(i + ": " + list[i]);
		}
	}

	// 4. ������� �� ������� (������� 3) ��� ������ �������� �� �����
	public static void Task4() {
		Random random = new Random();
		int value = 100;
		System.out.println("Array :" + value);
		int[] list = new int[value];

		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(50);
		}

		for (int i = 0; i < list.length; i++) {
			if (list[i] % 2 == 0) {
				System.out.println(i + ": " + list[i]);
			}

		}
	}

	// 5. ��������� �������� ���� �������� ��������� ������� �� ������� 3
	public static void Task5() {
		Random random = new Random();
		int value = 100;

		int s1 = 0, s2 = 0, r;

		System.out.println("Array :" + value);
		int[] list = new int[value];

		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(50);
		}

		for (int i = 0; i < list.length; i++) {
			if (list[i] % 2 == 0) {
				s1 += list[i];

			} else {
				s2 += list[i];
			}

		}

		r = s1 - s2;

		System.out.println(r);

	}

	// 6. ���������� ���������� ������ � �������� ��������� � ������� �� ������� 3.
	// ���������� ������ � ���������� �������� ������� �� �����
	public static void Task6() {
		Random random = new Random();
		int value = 100;

		int s1 = 0, s2 = 0, r;

		System.out.println("Array :" + value);
		int[] list = new int[value];

		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(50);
		}

		for (int i = 0; i < list.length; i++) {
			if (list[i] % 2 == 0) {
				s1 += 1;

			} else {
				s2 += 1;
			}

		}

		System.out.println("even: " + s1 + " add: " + s2);

	}

	// 7. ����� � ������� �� ����� ������������ / ����������� ������� �� ������� 3

	public static void Task7() {
		Random random = new Random();
		int value = 100;

		int max = 0, min = 0, r;

		int[] list = new int[value];

		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(50);
			System.out.println("Array :" + list[i]);
		}

		max = list[0];
		min = list[0];

		for (int i = 0; i < list.length; i++) {
			if (list[i] > max) {
				max = list[i];

			}

			if (list[i] < min) {
				min = list[i];

			}
		}

		System.out.println("max: " + max + " min: " + min);

	}

	// 8. ����� � ������� �� ����� ������������ / ����������� ������� �� ������� 3

	public static void Task8() {
		Random random = new Random();
		int value = 10;

		int maxOdd = 0, minOdd = 0, maxEven = 0, minEven = 0, r;
		int kOdd = 0;
		int kEven = 0;

		int[] list = new int[value];

		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(50);
			System.out.println("Array :" + list[i]);
		}

		for (int i = 0; i < list.length; i++) {

			if (list[i] % 2 == 0) {

				if (kEven == 0) {
					++kEven;
					maxEven = list[i];
					minEven = list[i];
				}

				if (list[i] > maxEven) {
					maxEven = list[i];

				}

				if (list[i] < minEven) {
					minEven = list[i];

				}
			} else {

				if (kOdd == 0) {
					++kOdd;
					maxOdd = list[i];
					minOdd = list[i];
				}

				if (list[i] > maxOdd) {
					maxOdd = list[i];

				}

				if (list[i] < minOdd) {
					minOdd = list[i];

				}
			}
		}

		System.out.println("maxEven: " + maxEven + " minEven: " + minEven);
		System.out.println("maxOdd: " + maxOdd + " minOdd: " + minOdd);
	}

	// 9. ��������� � ������ ���� char ���� ������� � ��� (������ ������� �� ������
	// ��������� ���������� �������� � ������� ������ ����� (��������� ������������
	// ����� toCharArray ������ String, ������ ����� ������������ ����� charAt() -
	// �.�. ������ char ����� ��������� �����������! )

	public static void Task9() {
		char[] list = new char[14];

		list[0] = '�';
		list[1] = '�';
		list[2] = '�';
		list[3] = '�';
		list[4] = '�';
		list[5] = '�';
		list[6] = '�';
		list[7] = '�';
		list[8] = '�';
		list[9] = '�';
		list[10] = '�';
		list[11] = '�';
		list[12] = '�';
		list[13] = '�';

	}

	// 10. ����������� ���������� ��� ��� ������ 9 � ���������� (����� ������������
	// ����� Scanner). �������� � ������ �� ������� 9 ������ � ��������.
	public static void Task10() {

		/*
		 * System.out.print("������� ����� ����� ����� �� 1 �� 10: "); Scanner scan =
		 * new Scanner(System.in); int number = scan.nextInt();
		 * System.out.println("�� ����� ����� " + number);
		 */
		char[] list = new char[14];

		int k = 14;

		while (k > 0) {
			Scanner scan = new Scanner(System.in);
			char c = scan.next().charAt(0);

			list[13 - --k] = c;

		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	// 11. ������� �� ������� (1� �������) ��� ��������, ������� 3
	public static void Task11() {

		Random random = new Random();
		int value = random.nextInt(50);
		System.out.println("Array :" + value);
		int[] list = new int[value];

		int temp = 0;
		for (int i = 0; i < list.length; i++) {

			temp = random.nextInt(50);

			if (temp % 3 != 0) {
				list[i] = temp;
			}
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(i + ": " + list[i]);
		}
	}

	// 12. �������� ������ ������� �� ������� 9 � ������������ � ��������
	// ����������� �������� ���������
	public static void Task12() {

	}

	// 13.1 ����� ��������
	public static void Task131() {

		Random random = new Random();
		int value = random.nextInt(50);
		System.out.println("Array :" + value);
		int[] list = new int[value];

		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(50);
		}
		System.out.println("�����������");
		boolean isSorted = false;
		int buf;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] > list[i + 1]) {
					isSorted = false;

					buf = list[i];
					list[i] = list[i + 1];
					list[i + 1] = buf;
				}
			}
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(i + ": " + list[i]);
		}

		System.out.println("��������");
		isSorted = false;
		int temp;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] < list[i + 1]) {
					isSorted = false;

					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(i + ": " + list[i]);
		}

	}

	// 14. ����� � ������� � ������� �� ����� ��� �������� � �������� ���������
	// (�������� �� 20 �� 23)

	public static void Task14() {

		Random random = new Random();
		int value = random.nextInt(50);
		System.out.println("Array :" + value);
		int[] list = new int[value];

		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(50);
		}

		int min = 5;
		int max = 10;
		for (int i = min; i < max; i++) {
			System.out.println(i + ": " + list[i]);
		}

	}
}
