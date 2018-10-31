package by.itacademy.vmermolenko.run;

public class MayApp2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		StringBuilder sb = new StringBuilder("123");
		StringBuilder sb2 = new StringBuilder("123");
		StringBuffer sb3 = new StringBuffer();
		
		System.out.println(sb.equals("123"));
		System.out.println(sb == sb2 );
		
		
		sb2.append("456");
		sb2.append("789");
		sb2.append(789);
		
		
		
		
	}

}
