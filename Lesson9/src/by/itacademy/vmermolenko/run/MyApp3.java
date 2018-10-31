package by.itacademy.vmermolenko.run;

public class MyApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "aaaaaaaaaaaa bbb cccccccccccccc dddddddddddd ee";
		
		/*
		str1 = str1.replace("     ", " ");
		str1 = str1.replace("    ", " ");
		str1 = str1.replace("   ", " ");
		str1 = str1.replace("  ", " ");
		*/
		char charinput = 'x';
		int k = 3;
		
		String[] list = str1.split(" ");
		
		String result = "";
		
		for (int i = 0; i < list.length; i++) {

			//System.out.println(list[i]);
			
			char[] tempstr = list[i].toCharArray();
			
			if (list[i].length() >=  k)
			{
				tempstr[k-1] = charinput;		
			}
			
			result +=  new String(tempstr) + " ";
		}
		
		
		System.out.println(result);
		
	}

}
