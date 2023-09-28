package Exo2;

public class Banque {
	
	final double[] comptes;
	
	public Banque(int NumCompts, int init_sold) {
		comptes = new double[NumCompts];
		_init_Compt(init_sold);
	}
	
	private void _init_Compt(int init_sold) {
		for(double c : comptes) {
			c = init_sold;
		}
	}
	
	public void transfer(int to, double montant ) {
		comptes[to] += montant;
		System.out.println("Account "+ to + " is received " + montant);
	}

}
