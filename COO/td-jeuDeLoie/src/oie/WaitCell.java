package oie;

public class WaitCell extends Cell
{
	public WaitCell(int ind)
	{
		super(ind);
	}
	
	public boolean canBeLeft() 
	{
		return true;
	}

	public int consequence(int diceThrow) 
	{
		return diceThrow;
	}
}
