package week10HW;

public class dice {

	private int maximum;
	private int numberOfThrows;
	
	public dice()
	{	
		maximum = 6;
		numberOfThrows = 0;
	}
	
	public int rollDice (int number)
	{
		numberOfThrows++;
		maximum = maximum * number;
		
		return ( 1 +(int)(Math.random() * maximum));
	}
	
	public void gamesLossWon( int loss, int won)
	{
		System.out.printf("Games loss: %d\nGames won: %d\n" , loss,won);
	}
	
	public void numberThrows()
	{
		System.out.printf("number of throws: %d\n", numberOfThrows);
	}
}
