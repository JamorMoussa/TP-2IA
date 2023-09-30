package Exo3;

import java.util.LinkedList;
import java.util.Queue;

public class main {
	
	public static void main(String[] args){
		 
		File<Integer> file = new File<Integer>(3);
		
		
		file.offer(10);
		file.offer(11);
		file.offer(12);
		
		file.poll();
	
		
		System.out.println(file);
		System.out.println(file.isEmpty());
	
		
	}
	
}
