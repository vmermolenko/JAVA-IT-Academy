package by.itacademy.vmermolenko.run;

import by.itacademy.vmermolenko.model.A;
import by.itacademy.vmermolenko.model.B;
import by.itacademy.vmermolenko.model.C;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();

		B b = new C();

		A a = new B();

		A[] aArr = new A[5];

		aArr[0] = a;
		aArr[1] = a;
		aArr[2] = a;

		Object[] oArr = new Object[5];

		oArr[0] = a;
		oArr[1] = b;
		oArr[2] = c;
		oArr[3] = "Hello world!";
		oArr[4] = 2018;

		for (int i = 0; i < oArr.length; i++) {

			if (oArr[i] instanceof B) {
				B bb = (B) oArr[i];
							
				bb.greetUser();
			}
		}

		System.out.println();

	}

}
