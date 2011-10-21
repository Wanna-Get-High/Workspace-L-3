package oie;

public class TeleportCell extends Cell
{
	private int jumpIndex;
	
	public TeleportCell(int ind,int jmpInd)
	{
		super(ind);
		this.jumpIndex = jmpInd;
	}
	
	public boolean canBeLeft() 
	{
		return true;
	}

	public int consequence(int diceThrow) 
	{
		return this.jumpIndex;
	}
}
