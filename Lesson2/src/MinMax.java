
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[] { 10, 1, 2, 3, 4, 5, 6, 11, 8, 9 };

		for (int i = 0; i < x.length; i++) {

			System.out.print(" " + x[i]);
			
		}
		int min = x[0];
		int max = x[0];

		int minIdx = 0;
		int maxIdx = 0;

		for (int i = 0; i < x.length; i++) {
			if (min > x[i]) {
				min = x[i];
				minIdx = i;
			}
			if (max < x[i]) {
				max = x[i];
				maxIdx = i;
			}
		}

		int temp = x[minIdx];
		x[minIdx] = x[maxIdx];
		x[maxIdx] = temp;

		System.out.println(" ");
		for (int i = 0; i < x.length; i++) {

			System.out.print(" " + x[i]);
			
		}


	}

}
