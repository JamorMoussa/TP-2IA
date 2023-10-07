package Exo3;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client{
    static Socket clientSocket;
    static String message;
    public static void main(String[] args) throws IOException, UnknownHostException{

        clientSocket = new Socket("127.0.0.1", 12346);
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Write a msg : ");
            message = input.nextLine();
            sendMessage(message);
        }

    }

    public static void sendMessage(String msg)throws IOException, UnknownHostException{
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        out.write(msg);
        out.newLine();
        out.flush();
    }
}
