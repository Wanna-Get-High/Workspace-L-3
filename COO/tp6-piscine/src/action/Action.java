package action;

public abstract class Action 
{
	/** the message of the action */
	protected String msg;
	/** the state of the action */
	protected ActionState state;
	
	public Action(String msg)
	{
		this.msg = msg;
		this.state = ActionState.notStarted;
	}
	
	public Action()
	{
		this("");
	}
	
	/** */
	protected abstract void inToDo();
	/** */
	protected abstract boolean stopCondition();
	
	public boolean isFinished()
	{
		return this.state == ActionState.finished;
	}
	/** */
	public void toDo()
	{
		if (!this.isFinished())
		{
			this.state = ActionState.started;
			this.inToDo();
			
			if (stopCondition())
			{
				this.state = ActionState.finished;
			}
		}
	}
	
	public ActionState getState()
	{
		return this.state;
	}
	
	public void setMsg(String msg)
	{
		this.msg = msg;
	}
}
