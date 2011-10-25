package oie;

public class GooseCell extends BasicCell
{
	public GooseCell(int ind,Board b)
	{
		super(ind,b);
	}
	@Override
	public int consequence(int diceThrow)
	{
		return board.getCell(super.consequence(diceThrow)+ diceThrow).consequence(diceThrow);
	}
}
