package Exo2;

import java.util.Random;

public class Transfert implements Runnable{
	
	public Banque banque;
	public int to;
	public double montant; 
	

	public Transfert(Banque banque, int to) {
		this.banque = banque;
		this.to = to;
	}

	@Override
	public void run() {
			
		banque.transfer(to, 100);
	}

}
