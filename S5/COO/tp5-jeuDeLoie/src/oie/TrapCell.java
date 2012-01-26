package oie;

public class TrapCell extends BasicCell
{
	public TrapCell(int ind,Board b)
	{
		super(ind,b);
	}
	@Override
	public boolean canBeLeft() 
	{
		return false;
	}
}