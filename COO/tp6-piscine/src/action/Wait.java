package action;

public class Wait extends Action 
{
	protected int timeToWait;
	protected int timeAlreadyWaited;
	
	public Wait(String msg, int ttw)
	{
		super(msg);
		this.timeToWait = ttw;
		this.timeAlreadyWaited = 0;
	}

	public Wait(int ttw) 
	{
		this("", ttw);
	}

	@Override
	public void inToDo() 
	{
		int timeLeft = this.timeToWait - this.timeAlreadyWaited++;
		System.out.print(this.msg + " " + timeLeft + "\n");
	}

	@Override
	protected boolean stopCondition() 
	{
		return this.timeToWait <= this.timeAlreadyWaited;
	}
}
