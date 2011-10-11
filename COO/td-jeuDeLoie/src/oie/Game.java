package oie;

import java.util.*;

/**
 * 
 * @author franziz
 * the game that contains the players and the field
 */
public class Game 
{
	protected List<Player> thePlayers;
	protected Board board;
	
	public Game(Board board)
	{
		this.thePlayers = new ArrayList<Player>();
		this.board = board;
	}
	
	public void addPlayer(Player p)
	{
		thePlayers.add(p);
		board.getCell(p.getCell().getIndex()).setPlayer(p);
	}
	
	public void play()
	{
		int diceResult = 0;
		int  consequence = 0;
		int currentInd  = 0;
		Player swapPlayer, currentPlayer;
		
		System.out.println(board.toString()); // printing the board
		System.out.println("");
		
		while (noPlayerWon()) // while no player is on the last Cell
		{
			for (int i=0; i<thePlayers.size();i++) // each player play
			{
				currentPlayer = thePlayers.get(i);
				currentInd = currentPlayer.getCell().getIndex(); // index of the current player

				if (board.getCell(currentInd).canBeLeft())
				{
					diceResult = currentPlayer.twoDicesThrow();	
					consequence = currentPlayer.getCell().consequence(diceResult);	// the index of the new cell
					
					if (board.getCell(consequence).isBusy())	// case of swap players
					{
						swapPlayer = board.getCell(consequence).getPlayer();// retrieving the player to swap
						
						currentPlayer.setCell(board.getCell(consequence));	// swapping places for the players cell
						swapPlayer.setCell(board.getCell(currentInd));
						
						board.getCell(consequence).setPlayer(currentPlayer); // swapping places for the board cell
						board.getCell(currentInd).setPlayer(swapPlayer);
						
						System.out.println("_ is on cell " + currentInd + " reaches cell : " +consequence);
						System.out.println(swapPlayer.toString() + " go to :" + swapPlayer.getCell().getIndex());
					}
					else 
					{
						currentPlayer.setCell(board.getCell(consequence)); 	// changing the current players cell
						board.getCell(consequence).setPlayer(currentPlayer);// changing the board cell
						board.getCell(currentInd).setPlayer(null);			// setting the previous board cell to null
						
						System.out.println("_ is on cell " + currentInd +" reaches cell : " +consequence);
					}
				}
				else
				{
					System.out.println(currentPlayer.toString() +" can't move");
				}
			}
			System.out.println(board.toString());  // printing the board
			System.out.println("");
		}
		System.out.println("end");
	}
	
	public boolean noPlayerWon()
	{
		for (int i=0; i<thePlayers.size();i++)
		{
			if (thePlayers.get(i).getCell().getIndex() == this.board.getNbOfCells() - 1)
				return false;
		}
		
		return true;
	}
	
	public static void main (String []args)
	{
		Board board = new Board(64);
		Game game = new Game(board);
		
		game.addPlayer(new Player("B",board.getCell(0)));
		game.addPlayer(new Player("T",board.getCell(0)));
		
		game.play();
	}
}
