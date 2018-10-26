package by.itacademy.vmermolenko.run;

import java.util.Arrays;
import java.util.Iterator;

public class StringTitle implements CharSequence {

	
	private char[] chars;
	
	public StringTitle(String str) {
		// TODO Auto-generated constructor stub
		this.chars = str.toCharArray();
	}
	
	public StringTitle(char[] chars) {
		// TODO Auto-generated constructor stub
		this.chars = chars;
	}
	
	
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return chars.length;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return chars[index];
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		char[] values = new char[end - start]; 
		
		int k = 0;
		for (int i = start; i < end; i++) {
			values[k++] = chars[i];
		}
		
		return new StringTitle(values);
	}

	@Override
	public String toString() {
		return new String(chars);
	}



}
