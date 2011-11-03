package action;

public class Scenario extends Scheduling
{
	@Override
	protected void inToDo()
	{
		this.theAction.get(0).toDo();
		System.out.print(this.msg);
		
		if (this.theAction.get(0).isFinished())
			this.theAction.remove(0);
	}
}
