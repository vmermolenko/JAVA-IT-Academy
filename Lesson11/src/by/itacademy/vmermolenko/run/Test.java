package by.itacademy.vmermolenko.run;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			generatex();
			} catch (C e) {
		} catch (D e) {
		} catch (H e) {
		} catch (A e) {
		}
	}

	public static void generatex() throws C, D, G, H {

	}
}

class A extends java.lang.Exception {
}

class B extends A {
}

class C extends B {
}

class D extends A {
}

class E extends A {
}

class F extends D {
}

class G extends D {
}

class H extends E {
}

class A1 {
	public void f() throws IOException {
	}
}

class B1 extends A1 {
	// public void f() throws Exception {}
	// public void f() throws IOException {}
	// public void f() throws InterruptedException, IOException {}
	// public void f() throws IOException, FileNotFoundException {}
	// public void f() throws FileNotFoundException {}
	// public void f() throws FileNotFoundException, InternalError {}
}
