package oie;

public class NormalCell extends Cell 
{
	public NormalCell(int ind)
	{
		super(ind);
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
