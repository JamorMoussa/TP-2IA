package Exo1;

public class main {

	public static void main(String[] args) {
		
		JobTotoEtTiti jobinterface = new JobTotoEtTiti();
		
		
		Thread toto = new Thread(jobinterface);
		
		Thread titi = new Thread(jobinterface);
		
		toto.start();
		titi.start();

	}

}
