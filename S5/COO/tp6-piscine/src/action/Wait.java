package action;

/**
 * The Class Wait.
 */
public class Wait extends Action 
{
	
	/** The time to wait. */
	protected int timeToWait;
	
	/** The time already waited. */
	protected int timeAlreadyWaited;
	
	/**
	 * Instantiates a new wait.
	 *
	 * @param msg the message
	 * @param ttw the time to wait
	 */
	public Wait(String msg, int ttw)
	{
		super(msg);
		this.timeToWait = ttw;
		this.timeAlreadyWaited = 0;
	}

	/**
	 * Instantiates a new wait.
	 *
	 * @param ttw the time to wait
	 */
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
