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
	}
	
	public void play()
	{
		int diceResult = 0;
		
		while (noPlayerWon())
		{
			for (int i=0; i<thePlayers.size();i++)
			{
				diceResult = thePlayers.get(i).twoDicesThrow();
				System.out.println("_ is on cell " +thePlayers.get(i).getCell().getIndex() +
						" and go to : " + thePlayers.get(i).getCell().consequence(diceResult));
			}
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
		
		game.addPlayer(new Player("biloute",board.getCell(0)));
		game.addPlayer(new Player("troudbal",board.getCell(0)));
		
		game.play();
	}
}
