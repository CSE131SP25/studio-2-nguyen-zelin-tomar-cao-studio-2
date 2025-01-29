package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your start amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Enter your win limit: ");
		double winLimit = in.nextDouble();
		System.out.println("Enter your win chance (number between 0 and 1): ");
		double winChance = in.nextDouble();
		System.out.println("Enter total simulations: ");
		int totalSimulations = in.nextInt();
		
		for (int x = totalSimulations; x > 0; x--) {
			int y = 0;
			//System.out.println("Simulation " + (totalSimulations + y) + ": ");
	
			while (0 < startAmount && startAmount < winLimit){
				y=y+2;
				System.out.println("Simulation " + y + ": ");
				double rand = Math.random();
				
				if (winChance>=rand) {
					startAmount++;
					System.out.println("you won!");
					
				}else {
					startAmount--;
					System.out.println("you lost :(");
				}
			}
		}
		}
}
	

	
//		while (0 < startAmount && startAmount < winLimit){
//			
//			double rand = Math.random();
//			
//			if (winChance>=rand) {
//				startAmount++;
//				System.out.println("you won!");
//				
//			}else {
//				startAmount--;
//				System.out.println("you lost :(");
//			}
			
		
			
		
		
		 
		
				
		
		



