/**
/Объявить 2 массива: целого и вещественного типа.
//Посчитать сумму элементов к каждом массиве, 
//вывести на экран.
//Разделить каждый элемент массива целого типа
//на максимальный элемент. 
//Разделить каждый элемент массива вещественного типа
//на минимальный элемент.

//*Поменять местами максимальный элемент 
//массива вещественного типа с минимальным
//элементом массива целого типа.
// Прирешении задачи создать не менее 10 методов
 */


public class Solution4 {

	// объявить два массива
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[] { 2, 54, 7, 8, 9, -7, 6, 4, 5 };
		double[] arr2 = new double[] { 23.5, -4.5, 53.5, 6.4, 56.2 };

		summa(arr1);
		summa(arr2);
		//double max1 = max(arr1);
		System.out.println("max(arr1)" + max(arr1));
		//divider(arr1, max(arr1));
		
		System.out.println("max(arr2)" + max(arr2));
		//divider(arr2, max(arr2));
		
		change(arr1, arr2); 
		
		printArray(arr1);
		printArray(arr2);
	}
	


	public static void summa(int[] arr) {
		double s = 0;

		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}

		System.out.println("Сумма: " + s);
	}

	public static void summa(double[] arr) {
		double s = 0;

		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}

		System.out.println("Сумма: " + s);
	}

	public static double max(double[] arr) {

		double max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

	public static double max(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}

		return (double) max;
	}

	public static double min(double[] arr) {

		double min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return min;
	}

	public static double min(int[] arr) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return (double) min;
	}
	
	
	public static int idxMin(int[] arr) {

		int idxMin = 0;
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				idxMin = i;
			}
		}

		return idxMin;
	}
	
	public static int idxMin(double[] arr) {

		int idxMin = 0;
		double min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				idxMin = i;
			}
		}

		return idxMin;
	}

	
	public static int idxMax(int[] arr) {

		int idxMax = 0;
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				idxMax = i;
			}

		}

		return idxMax;
	}
	
	public static int idxMax(double[] arr) {

		int idxMax = 0;
		double max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				idxMax = i;
			}

		}

		return idxMax;
	}
	
	public static int[] divider(int[] arr, double denominator) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] /= denominator;
		}
		return arr;
	}

	public static int[] divider(int[] arr, int denominator) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] /= denominator;
		}
		return arr;
	}

	public static double[] divider(double[] arr, double denominator) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] /= denominator;
		}
		return arr;
	}

	public static double[] divider(double[] arr, int denominator) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] /= denominator;
		}
		return arr;
	}
	
	public static void printArray(double[] arr) {
		System.out.println("Печать double");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}
	
	public static void printArray(int[] arr) {
		System.out.println("Печать int");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

	public static void change(int[] arr1, double[] arr2) {
		
		
		double p_max2 = arr2[idxMax(arr2)];
		
		
		arr2[idxMax(arr2)] = (double) arr1[idxMin(arr1)];
		arr1[idxMin(arr1)] = (int) p_max2;
		
 		
	}
}
