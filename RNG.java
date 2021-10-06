

import java.util.Random;
import java.util.Scanner;

public class RNG {
	public static void random(int a) {
		int answer, guess, count;

		// maximum value is 100
		final int MAX = a;
		count = 1;

		Scanner in = new Scanner(System.in);

		// Random instance for random number
		Random rand = new Random();

		boolean correct = false;

		// correct answer
		answer = rand.nextInt(MAX)+1;

		System.out.println("Enter your First guess: ");
		// loop until the guess is correct
		 
		while (!correct) {

		// guess value
		guess = in.nextInt();

		System.out.println("The number of guess is " + count);
		count++;

		// if guess is greater than actual
		if (guess > answer) {
		System.out.println("Your guess is high, try again");
		System.out.println("Enter your next guess between " + guess + " and " + MAX );
		}

		// if guess is less than actual
		else if (guess < answer) {
		System.out.println("Your guess is low, try again");
		System.out.println("Choose your guess between " + guess + " and " + MAX);
		}

		// guess is equal to actual value
		else {

		System.out.println( "Congratulations, you guessed correctly.");
		System.out.println("yes or no? ");
		//final task to ask the user if he/she wants to play again
		String str=in.next();
		if(str=="yes")
		{
			correct = true;
		}	
		else {	

		System.exit(0);}
		}
		}
	}
}
