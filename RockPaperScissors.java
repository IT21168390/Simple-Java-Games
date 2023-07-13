import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String[] rockPaperAndScissors = {"r","p","s"};
			String computerMove = rockPaperAndScissors[new Random().nextInt(rockPaperAndScissors.length)];
	
			String playerMove;
	
			while(true) {
				System.out.print("Please enter your move ('r','p' or 's'): ");
				playerMove = scanner.nextLine();
				if(playerMove.equals("s")||playerMove.equals("p")||playerMove.equals("r")) {
					break;
				}
				System.out.println(playerMove+" is not a valid move.");
			}
			
			System.out.println("\nComputer played "+computerMove+"\n");
			
			if(playerMove.equals(computerMove)) {
				System.out.println("The game was a tie.");
			}
			else if(playerMove.equals("r")) {
				if(computerMove.equals("s")) {
					System.out.println("You win!");
				}
				else if(computerMove.equals("p")) {
					System.out.println("You lose!");
				}
			}
			else if(playerMove.equals("p")) {
				if(computerMove.equals("s")) {
					System.out.println("You lose!");
				}
				else if(computerMove.equals("r")) {
					System.out.println("You win!");
				}
			}
			else if(playerMove.equals("s")) {
				if(computerMove.equals("p")) {
					System.out.println("You win!");
				}
				else if(computerMove.equals("r")) {
					System.out.println("You lose!");
				}
			}
			System.out.print("Play again? (Y/N) ");
			String playAgain = scanner.nextLine();
			if(!playAgain.equalsIgnoreCase("y"))
				break;
		}
		scanner.close();
	}

}
