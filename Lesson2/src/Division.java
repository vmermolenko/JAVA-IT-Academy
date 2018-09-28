import java.text.DecimalFormat;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] x = new float[] { 10, 1, 2, 3, 4, 5, 6, 11, 8, 9 };

		for (int i = 0; i < x.length; i++) {

			System.out.print(" " + x[i]);
			
		}
		float max = x[0];

		for (int i = 0; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
			}
		}
		
		System.out.println(" ");
		for (int i = 0; i < x.length; i++) {

			DecimalFormat df = new DecimalFormat("#.##");
			df.format(x[i]/max);
			System.out.print(" " + df.format(x[i]/max));
			
		}
	}

}
