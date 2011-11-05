package action;

/**
 * The Class Scheduler.
 */
public class Scheduler extends Scheduling 
{
	
	/** The number of finished action. */
	protected int nbFinishedAction;
	
	/**
	 * Instantiates a new scheduler.
	 */
	public Scheduler()
	{
		super();
	}
	
	@Override
	protected void inToDo()
	{
		this.incrementIndex();
		this.theActions.get(this.currentActionIndex).toDo();
		
		if (this.theActions.get(this.currentActionIndex).isFinished())
		{
			this.theActions.remove(this.currentActionIndex);
			this.decrementIndex();
		}
		System.out.print(this.msg);
	}
}