package by.htp.example;

import java.io.IOException;
import java.net.Socket;

public class MainConsoleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Socket socket = new Socket("127.0.0.1", 9292);
			
			socket.getOutputStream().write("Hello Server".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
