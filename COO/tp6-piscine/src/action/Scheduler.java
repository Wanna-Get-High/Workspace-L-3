package action;

public class Scheduler extends Scheduling 
{
	protected int nbFinishedAction;
	
	public Scheduler()
	{
		super();
	}
	
	@Override
	protected void inToDo()
	{
		
	}

	@Override
	protected boolean stopCondition() 
	{
		return false;
	}
}