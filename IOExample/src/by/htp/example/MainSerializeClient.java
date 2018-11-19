package by.htp.example;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import by.itacademy.vmermolenko.serialize.model.*;


public class MainSerializeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Socket socket = new Socket("127.0.0.1", 9292);

			//socket.getOutputStream().write("Hello Server".getBytes());
			User user = new User("Ivan Ivanov", new Address("Moskov"));
			
			try(ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())){
				oos.writeObject(user);
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
