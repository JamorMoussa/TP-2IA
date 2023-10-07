package Q1;

import java.net.*;
import java.io.*;

public class Server {

    static ServerSocket server;

    public static void main(String[] args) throws IOException{
        
        server = new ServerSocket(12345);

        Socket clientSocket = server.accept();

        BufferedReader in = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        out.write("Hello, client");
        out.newLine();
        out.write("je suis Moussa");
        out.newLine();
        out.flush();

        server.close();
        
    }
}
