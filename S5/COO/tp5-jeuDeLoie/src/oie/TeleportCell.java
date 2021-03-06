package oie;

public class TeleportCell extends BasicCell
{
	/** the index where the player have to jump to*/
	private int jumpIndex;
	
	public TeleportCell(int ind,int jmpInd,Board b)
	{
		super(ind,b);
		this.jumpIndex = jmpInd;
	}
	
	@Override
	public int consequence(int diceThrow)
	{
		return board.getCell(boundedIndex(this.jumpIndex)).consequence(diceThrow);
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
