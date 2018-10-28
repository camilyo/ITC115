import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {
		Random rand = new Random();
		
	//calling the function	
		makeGuesses(rand);	

	}
	// Defining my makeGuesses function
	private static int makeGuesses(Random rand) {
		
		
		//guessing numbers between 1 and 50
		int guessingIt = rand.nextInt(50) + 1;
		System.out.println("guess = " + guessingIt);
		//defining the number of guesses function
		int numGuesses = 1;
		
		//while the range of the guesses are between 1 and 47, keep guessing new numbers
		while(guessingIt > 0 && guessingIt < 48) {
			guessingIt = rand.nextInt(50) + 1;
			//print the number guessed
			System.out.println("guess = " + guessingIt);
			//increment the number of guesses function
			numGuesses++;
		}
		//print the amount of number guessed that were less than 48
		System.out.println("Total guesses = " + numGuesses);
		
		return guessingIt;
	}
		
}
