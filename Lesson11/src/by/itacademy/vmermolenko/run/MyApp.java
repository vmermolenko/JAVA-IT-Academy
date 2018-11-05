package by.itacademy.vmermolenko.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MyApp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println(1);

		FileInputStream sc = null;
		try {
			sc = new FileInputStream("c://data.txt");
			System.out.println("2");
			sc.read();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		try (FileOutputStream fos = new FileOutputStream("c://data2.txt");){
			
			System.out.println("2");
			fos.write("hello world".getBytes()[0]);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println(5);
		
		doSmth2();
	}
	
	public static void doSmth2() {
		
		try {
			doSmth3();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void doSmth3() throws Exception {
		throw new Exception();
	}
	
	public static void doSmth4() throws IOException, SQLException {
		throw new IOException();
	}
	
	/*
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.out.println("0");
		
		try {
			System.out.println("1");
			FileInputStream sc = new FileInputStream("c://data.txt");
			System.out.println("2");
			sc.read();
			System.out.println("3");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("4");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("5");
		}
		
		System.out.println("6");
	}
	
	*/

	/*
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream sc = new FileInputStream("c://data.txt");
		
			sc.read();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		String s = "aaa";
		
		s.charAt(200);
		
		
		int[] x = null;
		
		//System.out.println(x.length);
		try {
		doSmth(x);
		} catch (Throwable e) {
			// TODO: handle exception
		}
		//Throwable th;
		
	}
	
	public static void doSmth(int [] x) throws Throwable {
		
		if (x != null) {
			System.out.println(x.length);
		}
		
		throw new Throwable();
	}
*/
}
