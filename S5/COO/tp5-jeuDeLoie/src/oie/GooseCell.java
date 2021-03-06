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
		return board.getCell(this.boundedIndex(super.consequence(diceThrow) + diceThrow)).consequence(diceThrow);
	}
	
	private int boundedIndex(int index) 
	{
		int lastInd = board.getNbOfCells() - 1;
		
		if (index > lastInd )
		{
			return lastInd - (index - lastInd);
		}
		else
		{
			return index;
		}
	}
}
