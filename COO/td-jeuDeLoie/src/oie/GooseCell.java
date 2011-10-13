package oie;

public class GooseCell extends Cell
{
	
	public GooseCell(int ind)
	{
		super(ind);
	}
	
	public void setPlayer(Player player)
	{
		this.player = player;
	}
	
	public boolean canBeLeft() 
	{
		return true;
	}

	public int consequence(int diceThrow)
	{
		return this.index + diceThrow;
	}
}
