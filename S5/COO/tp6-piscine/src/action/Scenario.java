package action;

/**
 * The Class Scenario.
 */
public class Scenario extends Scheduling
{

	@Override
	protected void inToDo()
	{
		System.out.print(this.msg);
		this.theActions.get(0).toDo();
		
		if (this.theActions.get(0).isFinished())
			this.theActions.remove(0);
	}
}