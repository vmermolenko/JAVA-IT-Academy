package by.htp.example.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainSerializeServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ServerSocket serverSocket = new ServerSocket(9292)) {

			System.out.println("Server invocation");
			

			while (true) {
				Socket clientsocket = serverSocket.accept();

				try (ObjectInputStream ois = new ObjectInputStream(clientsocket.getInputStream())) {
					Object obj = ois.readObject();
					
					System.out.println(obj);
				}

				System.out.println("Server connected end and brought us message:");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
