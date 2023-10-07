package Exo3;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server{

    static ServerSocket serverSocket;
    static String message;
    static ArrayList<Socket> ClientsList = new ArrayList<Socket>();
    public static void main(String[] args) throws IOException, InterruptedException{

        serverSocket = new ServerSocket(12346);

        Thread t1 = new Thread(()->{
            while(true){
                try {
                    sendMessageToClients();
                } catch (IOException e) {
                    System.out.println("Error"+ e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while(true){
                try {
                    System.out.println("Server is waiting ....");
                    Socket clientScoket = serverSocket.accept();
    
                    ClientsList.add(clientScoket);

                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }

    public static String getMessageFromClient(Socket client) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

        return in.readLine();

    }

    public static void sendMessageToClients() throws IOException{
        String msg;
        System.out.print("");
        for(var c: ClientsList){
            msg = getMessageFromClient(c);
            System.out.println(msg);
            sendMessage(msg, c);

        }
    }
    public static void sendMessage(String msg, Socket client)throws IOException, UnknownHostException{
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

        out.write(msg);
        out.newLine();
        out.flush();
    }
}