import java.util.ArrayList;

public class MainCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ñircle> list = new ArrayList<Ñircle>();

		list.add(new Ñircle(1, 1, 1, 1));
		list.add(new Ñircle(2, 1, 2, 2));
		list.add(new Ñircle(3, 1, 3, 3));
		list.add(new Ñircle(4, 1, 4, 4));
		list.add(new Ñircle(5, 1, 4, 4));
		list.add(new Ñircle(6, 1, 4, 4));

		if ((list.get(0).x - list.get(2).x) / (list.get(1).x - list.get(2).x) == (list.get(0).y - list.get(2).y)
				/ (list.get(1).y - list.get(2).y)) {
			//System.out.println("Yes");
		} else {
			//System.out.println("No");
		}

		int i = 1;
		
		for (Ñircle ñircle1 : list) {
			for (Ñircle ñircle2 : list) {
				for (Ñircle ñircle3 : list) {
					
					if (!ñircle1.equals(ñircle2) && !ñircle2.equals(ñircle3) && !ñircle1.equals(ñircle3)) {
					if ((ñircle1.x - ñircle2.x) / (ñircle2.x - ñircle3.x) == (ñircle1.y - ñircle3.y)
							/ (ñircle2.y - ñircle3.y)) {
						System.out.println("Yes" + ñircle1.id );
					} else {
						System.out.println("No");
					}
					}
				}
			}
		}

	}

}
