package Exo1_Q1;

import java.net.*;
import java.util.Random;
import java.io.*;

public class Server {

	final static int port_number = 12345;
	static ServerSocket server;
	static Boolean Running=true; 
	
	static String[] proverbes = {
		"Quand la pauvrete entre par la porte, l'amour s'en va par la fenetre ",
		"On ne peut empecher le chien d'aboyer, ni le menteur de mentir ",
		"Aime-toi et tu auras des amis" ,
		"Un bon pere de famille doit etre partout, Dernier couche premier debout" ,
		"La douceur du miel ne console pas de la piqûre de l'abeille", 
		"Avec du temps et de la patience, on vient a bout de tout ",
		"Vieille amitie ne craint pas la rouille" ,
		"Il n'y a pas de grenouille qui ne trouve son crapaud ",
		"Plus on desire une chose, plus elle se fait attendre ",
		"Celui qui seme l'injustice moissonne le malheur" 
	};
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(port_number);
			System.out.println("The server is wating for a connection.... ");
			
			while(Running){
				Socket client = server.accept();
				
				//System.out.println(proverbes[random.nextInt(10)]);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				
				out.write(proverbes[random.nextInt(10)]);
				out.newLine();
				out.flush();
			}
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
