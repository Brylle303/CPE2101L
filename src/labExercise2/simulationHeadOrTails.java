package labExercise2;

import java.util.Random;

public class simulationHeadOrTails {
	
	public static void main (String[] args) {
		Random randomGenerator = new Random();
		
		int heads = 0;
		int tails = 0;
		int coinFlip;
		
		for(int i=0; i < 2000000; i++) {
			
			coinFlip = randomGenerator.nextInt(2);
			
			if(coinFlip == 1) {
				heads++;
			}
			else {
				tails++;
			}
		}
		
		System.out.println("[Coin Flip]");
		System.out.println("Heads: " + heads);
		System.out.println("Tails: " + tails);
		
	}

}
