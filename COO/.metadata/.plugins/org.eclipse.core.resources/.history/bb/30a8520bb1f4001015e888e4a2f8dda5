package oie;

public class GooseCell extends Cell
{
	
	public GooseCell(int ind)
	{
		super(ind);
	}
	
	public boolean canBeLeft() 
	{
		return true;
	}

	public int consequence(int diceThrow)
	{
		if ( this.index + diceThrow*2 < 63)
		{
			return this.index +diceThrow*2;
		}
		else
		{
			return 63 - (this.index + diceThrow*2);
		}
	}
}
