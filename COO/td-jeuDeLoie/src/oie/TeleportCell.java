package oie;

public class TeleportCell extends BasicCell
{
	private int jumpIndex;
	
	public TeleportCell(int ind,int jmpInd)
	{
		super(ind);
		this.jumpIndex = jmpInd;
	}

	public int consequence(int diceThrow) 
	{
		return this.jumpIndex;
	}
}
