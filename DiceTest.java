package week10HW;
import java.util.Scanner;

public class DiceTest {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int numberOfDice;
		int userGuess;
		int diceRolled;
		int gameWon = 0;
		int gameLoss = 0;
		
		boolean again = true;
		
		dice game = new dice();
		
		while(again)
		{
			System.out.printf("Enter number of dice: ");
			numberOfDice = input.nextInt();
			
			diceRolled = game.rollDice(numberOfDice);
			
			System.out.printf("guess points: ");
			userGuess = input.nextInt();
			
			if( userGuess == diceRolled)
			{
				System.out.printf("YOU got it! it was %d\n." , diceRolled);
				gameWon++;
				game.gamesLossWon(gameLoss, gameWon);
			}
			else
			{
				System.out.printf("You lose! it was %d\n.", diceRolled);
				gameLoss++;
				game.gamesLossWon(gameLoss,gameWon);
			}
			game.numberThrows();
			
			System.out.printf("\nPress 1 to play again");
			int playAgain = input.nextInt();
			if(playAgain != 1)
				again = false;
		}
		input.close();
	}
}
