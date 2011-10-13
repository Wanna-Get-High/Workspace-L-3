package oie;

import java.util.*;

public class StartCell extends Cell
{
	List<Player> players;
	
	public StartCell(int ind)
	{
		super(ind);
		players = new ArrayList<Player>();
	}

	@Override
	public boolean canBeLeft()
	{
		return true;
	}

	@Override
	public int consequence(int diceThrow) 
	{
		return diceThrow;
	}
	
	public void setPlayer(Player p)
	{ 
		players.add(p);
	}
	public void setPlayer(Player playerToAdd,Player playerToRemove)
	{ 
		players.add(playerToAdd);
		players.remove(playerToRemove);
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
}
