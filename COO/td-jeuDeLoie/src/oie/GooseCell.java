package oie;

public class GooseCell extends BasicCell
{
	public GooseCell(int ind)
	{
		super(ind);
	}

	public int consequence(int diceThrow)
	{
		return this.index + diceThrow;
	}
}
