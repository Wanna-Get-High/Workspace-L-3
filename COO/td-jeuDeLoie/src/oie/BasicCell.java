package oie;

public class BasicCell implements Cell
{
	/** back pointer to the board*/
	protected Board board;
	/** the index of the cell*/
	protected int index;
	
	/** the player on that cell*/
	protected Player player;

	public BasicCell(int ind,Board b)
	{
		this.index = ind;
		this.board = b;
	}
	
	public int getIndex()
	{
		return this.index;
	}

	public boolean isBusy()
	{
		return this.player != null;
	}

	public void setPlayer(Player player)
	{
		this.player = player;
	}
	
	public Player removePlayer(Player player)
	{
		if (this.player == player)
			this.player=null;
		else 
			throw new RuntimeException();
		
		return player;
	}
	
	public Player getPlayer()
	{
		return this.player;
	}

	public boolean canBeLeft()
	{
		return true;
	}

	public int consequence(int diceThrow) 
	{
		return this.index;
	}	
}