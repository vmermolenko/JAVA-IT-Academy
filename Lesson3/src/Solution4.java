
public class Solution4 {

	// объ€вить два массива
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[] { 2, 54, 7, 8, 9, -7, 6, 4, 5 };
		double[] arr2 = new double[] { 23.5, -4.5, 53.5, 6.4, 56.2 };

		summa(arr1);
		summa(arr2);
	}

	public static void summa(int[] arr) {
		double s = 0;

		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}

		System.out.println("—умма: " + s);
	}

	public static void summa(double[] arr) {
		double s = 0;

		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}

		System.out.println("—умма: " + s);
	}

	public static double max(double[] arr) {

		double max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[0]) {
				max = arr[0];
			}
		}

		return max;
	}

	public static double max(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[0]) {
				max = arr[0];
			}

		}

		return (double) max;
	}

	public static double min(double[] arr) {

		double min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[0]) {
				min = arr[0];
			}
		}

		return min;
	}

	public static double min(int[] arr) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[0]) {
				min = arr[0];
			}
		}

		return (double) min;
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
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[0]);
		}
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[0]);
		}
	}

	public static double[] change(double[] arr,int[] arr1, int denominator) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] /= denominator;
		}
		return arr;
	}
}
