import java.util.ArrayList;

public class MainCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<�ircle> list = new ArrayList<�ircle>();

		list.add(new �ircle(1, 1, 1, 1));
		list.add(new �ircle(2, 1, 2, 2));
		list.add(new �ircle(3, 1, 3, 3));
		list.add(new �ircle(4, 1, 4, 4));
		list.add(new �ircle(5, 1, 4, 4));
		list.add(new �ircle(6, 1, 4, 4));

		if ((list.get(0).x - list.get(2).x) / (list.get(1).x - list.get(2).x) == (list.get(0).y - list.get(2).y)
				/ (list.get(1).y - list.get(2).y)) {
			//System.out.println("Yes");
		} else {
			//System.out.println("No");
		}

		int i = 1;
		
		for (�ircle �ircle1 : list) {
			for (�ircle �ircle2 : list) {
				for (�ircle �ircle3 : list) {
					
					if (!�ircle1.equals(�ircle2) && !�ircle2.equals(�ircle3) && !�ircle1.equals(�ircle3)) {
					if ((�ircle1.x - �ircle2.x) / (�ircle2.x - �ircle3.x) == (�ircle1.y - �ircle3.y)
							/ (�ircle2.y - �ircle3.y)) {
						System.out.println("Yes" + �ircle1.id );
					} else {
						System.out.println("No");
					}
					}
				}
			}
		}

	}

}
