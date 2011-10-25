package action;

public class Wait extends Action 
{
	
	protected int timeToWait;
	
	public Wait(String msg, int ttw)
	{
		super(msg);
		this.timeToWait = ttw;
	}

	public Wait(int ttw) 
	{
		this("", ttw);
	}

	@Override
	public void inToDo() 
	{		
		this.timeToWait--;
	}

	@Override
	protected boolean stopCondition() 
	{
		return this.timeToWait == 0;
	}
}
