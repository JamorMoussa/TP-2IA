package Exo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class JobTotoEtTiti implements Runnable {
	private Compte cmpt = new Compte();
	public Boolean is_able = true; 
	public String[] who = {"Toto", "Titi"};
	private Lock lock = new ReentrantLock();
	private int i = 0;
	
	public void do_retrait(float montant) throws InterruptedException {
		
		lock.lock();
		if(cmpt.get_sold() >= montant) {
			Thread.sleep(200);
			cmpt.retirer_sold(montant);
			System.out.println(who[i%2] + " a effectué un retrait de "+ Float.toString(montant));
			System.out.println("le sold est : " + cmpt.get_sold());
			i++;
			lock.unlock();
		}else {
			System.out.println("Pas assez d\'argent pour retirer!.");
			is_able = false;
		}
	}
	
	public void run() {
		
		while(is_able) {
			try {
				do_retrait(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
