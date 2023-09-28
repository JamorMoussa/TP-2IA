package Exo2;

import java.util.Random;

public class main {

	public static void main(String[] args) {

		Banque banque = new Banque(100, 1000);
	
		Random random = new Random();
		
		int to;
		Transfert tr;
		while(true) {
	
			to = random.nextInt(100);
			
			tr = new Transfert(banque, to);
		
			new Thread(tr).start();
		}
	}
}


