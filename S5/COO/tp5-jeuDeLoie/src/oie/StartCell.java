package oie;

import java.util.ArrayList;
import java.util.List;


public class StartCell implements Cell
{
	
	protected List<Player> players;
	protected int index;
	protected Board board;
	
	public StartCell(int ind)
	{
		players = new ArrayList<Player>();
		this.index = ind;
	}

	public boolean canBeLeft()
	{
		return true;
	}

	public int consequence(int diceThrow) 
	{
		return this.index;
	}
	
	public void setPlayer(Player p)
	{
		players.add(p);
	}
	
	public Player removePlayer(Player playerToRemove)
	{
		if (players.contains(playerToRemove))
		{
			players.remove(playerToRemove);
		}
		else 
			throw new RuntimeException();
		
		return playerToRemove;
	}

	public int getIndex() 
	{
		return this.index;
	}
	
	public String toString()
	{
		String play = "";
		for (Player p : players)
		{
			if (p != null)
				play += p.toString();
		}
		return play;
	}
	
	// never reached methods
	public Player getPlayer() 
	{
		return null;
	}
	
	public boolean isBusy() 
	{
		return false;
	}

}
