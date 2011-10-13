package oie;

public class NormalCell extends Cell 
{
	public NormalCell(int ind)
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
		return this.index;
	}
}
