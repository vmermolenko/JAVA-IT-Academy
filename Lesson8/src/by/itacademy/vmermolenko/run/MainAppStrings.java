package by.itacademy.vmermolenko.run;

public class MainAppStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("I am cool developer");
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(8));
		System.out.println(str1.subSequence(0, 10));
		
		StringTitle str2 = new StringTitle("I am cool developer");
		
		System.out.println(str2.length());
		System.out.println(str2.charAt(8));
		System.out.println(str2.subSequence(0, 10));
	}

}
