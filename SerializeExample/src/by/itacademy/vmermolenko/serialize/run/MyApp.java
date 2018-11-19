package by.itacademy.vmermolenko.serialize.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import by.itacademy.vmermolenko.serialize.model.*;

public class MyApp {

	private static void serializeObject(Object obj) {

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("user"))) {

			os.writeObject(obj);

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private static Object deserializeObject() {
		Object obj = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user"))) {

			obj = ois.readObject();

		} catch (ClassNotFoundException | IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User user = new User("Blinov", "Minsk");
		User user1 = new User("Pavel Pavlov", new Address("Minsk"));

		serializeObject(user1);

		User user2 = (User) deserializeObject();

		System.out.println(user2);
	}
}
