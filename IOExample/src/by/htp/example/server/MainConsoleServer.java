package by.htp.example.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainConsoleServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			System.out.println("Server invocation");
			ServerSocket serverSocket = new ServerSocket(9292);

			while (true) {
				Socket clientsocket = serverSocket.accept();

				byte[] data = new byte[1024];

				clientsocket.getInputStream().read(data);

				String msg = new String(data);

				System.out.println("Server connected end and brought us message:");
				System.out.println(msg);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
