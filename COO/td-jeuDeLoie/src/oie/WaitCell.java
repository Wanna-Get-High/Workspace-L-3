package oie;

public class WaitCell extends BasicCell
{
	/** The time that a player have to wait on this cell */
	protected int TimeToWait;
	
	public WaitCell(int ind, int ttw,Board b)
	{
		super(ind,b);
		this.TimeToWait = ttw;
	}
	@Override
	public boolean canBeLeft() 
	{
		if (this.TimeToWait == 0)
		{
			this.TimeToWait = 2;
			return true;
		}
		System.out.print(" have to wait " +this.TimeToWait +" turn(s) ---");
		this.TimeToWait--;
		return false;
	}
	@Override
	public void setPlayer(Player p)
	{
<<<<<<< HEAD
		this.TimeToWait = 2;
		return this.index;
=======
		this.player = p;
>>>>>>> 65814ec35cf029b591471c155a5a7ce241570809
	}
}
