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
		this.incrementIndex();
		this.theAction.get(this.currentActionIndex).toDo();
		
		if (this.theAction.get(this.currentActionIndex).isFinished())
		{
			this.theAction.remove(this.currentActionIndex);
			this.decrementIndex();
		}
		System.out.print(this.msg);
	}
}
