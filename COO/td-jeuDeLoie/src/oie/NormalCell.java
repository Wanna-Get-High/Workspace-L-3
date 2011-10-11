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
		if ( this.index + diceThrow < 63)
		{
			this.index += diceThrow;
			return this.index;
		}
		else
		{
			this.index = 63 - (this.index + diceThrow - 63);
			return this.index;
		}
	}
}