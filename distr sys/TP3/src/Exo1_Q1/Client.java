package Exo1_Q1;

import java.io.*;
import java.net.Socket;

public class Client {
	
	static String server_adr = "127.0.0.1";
	static int port = 12345;
	
	static Socket client;

	public static void main(String[] args) {
		
		try {
		client  = new Socket(server_adr, port);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		
		String message = in.readLine();
		
		System.out.println("<client> : " + message);
		
		client.close();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}	

}
