import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		int score = 100;
		int tryCount = 0;
		//String stop = "~";
		Scanner scanner = new Scanner(System.in);
		
		int randomNumber = random.nextInt(100) + 1;  // 0 to 99 + 1
		
		System.out.print("Enter your guess (1-100): ");
		
		while (/*stop!='s' || stop!='S'*/true) {
			
			String input = scanner.next();
			
			if(input.equalsIgnoreCase("S")) {
				System.out.println("\nGame ended.\nYou have tried "+tryCount+" times.");
				break;
			}
			else if(!input.matches("[0-9][0-9]?|100")) {   //  [1-9]\\d*|100 gets even larger numbers as well.
				System.out.println("Invalid input!");
				System.out.print("(Press 'S' to Stop the Game.)\nEnter your guess (1-100): ");
				continue;
			}
			
			tryCount++;
			int guessedNumber = Integer.parseInt(input);
			
			if (guessedNumber == randomNumber) {
				System.out.println("\n\tCorrect! You Win!\n\t__ Your Score: "+score+" __");
				if(score==100)
					System.out.println("\t***** FANTASTIC! *****");
				break;
			}
			else if (guessedNumber < randomNumber)
				System.out.print("Nope! The number is higher.\n(Press 'S' to Stop the Game.) Try again: ");
			else
				System.out.print("Nope! The number is lower.\n(Press 'S' to Stop the Game.) Try again: ");
			
			score -= 10;
			
			/*
			System.out.println("- Press 'C' to Continue, or Press 'S' to Stop the Game: ");
			stop = scanner.next();
			if(stop.equalsIgnoreCase("S")) { // stop=="S" || stop=="s"
				System.out.println("\nGame ended.\nYou have tried "+tryCount+" times.");
				break;
			}
			else if(stop.equalsIgnoreCase("c"))
				continue;
			*/
		}
		
		scanner.close();
		
	}

}
