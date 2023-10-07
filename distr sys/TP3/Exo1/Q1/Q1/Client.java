package Q1;

import java.io.*;
import java.net.*;

public class Client {

    static Socket clientSocket;
    public static void main(String[] args)throws IOException, UnknownHostException{

        clientSocket = new Socket("127.0.0.1", 12345);

        BufferedReader in = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        String serverMessage = in.readLine();
        System.out.println(serverMessage);

        serverMessage = in.readLine();
        System.out.println(serverMessage);

        clientSocket.close();
    
    }
    
}
