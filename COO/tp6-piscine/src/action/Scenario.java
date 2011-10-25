package action;

public class Scenario extends Scheduling
{
	public Scenario()
	{
		super();
	}
	
	@Override
	protected void inToDo()
	{
		this.theAction.get(this.currentActionIndex).toDo();
		
		if (this.theAction.get(this.currentActionIndex).isFinished())
		{
			this.theAction.remove(this.currentActionIndex);
		}
		else 
		{
			this.currentActionIndex++;
		}
	}
}