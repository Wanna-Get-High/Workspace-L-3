package oie;

public class WaitCell extends Cell
{
	protected int TimeToWait;
	
	public WaitCell(int ind, int ttw)
	{
		super(ind);
		this.TimeToWait = ttw;
	}
	
	public boolean canBeLeft() 
	{
		if (this.TimeToWait == 0)
		{
			this.TimeToWait = 2;
			return true;
		}
		System.out.print("have to wait " +this.TimeToWait +" turn(s) --- ");
		this.TimeToWait--;
		return false;
	}
	
	public int consequence(int diceThrow)
	{
		this.TimeToWait = 2;
		return this.index;
	}
}
