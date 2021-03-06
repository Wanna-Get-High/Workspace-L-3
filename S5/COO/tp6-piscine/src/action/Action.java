package action;


/**
 * The Class Action.
 */
public abstract class Action 
{
	
	/** the message of the action. */
	protected String msg;
	
	/** the state of the action. */
	protected ActionState state;
	
	/**
	 * Instantiates a new action.
	 *
	 * @param msg the msg
	 */
	public Action(String msg)
	{
		this.msg = msg;
		this.state = ActionState.notStarted;
	}
	
	/**
	 * Instantiates a new action.
	 */
	public Action()
	{
		this("");
	}
	
	/**
	 * the things the action has to do.
	 */
	protected abstract void inToDo();
	
	/**
	 * the condition to stop the action.
	 *
	 * @return true if the action can be stopped
	 */
	protected abstract boolean stopCondition();
	
	/**
	 * Checks if is finished.
	 *
	 * @return true, if is finished
	 */
	public boolean isFinished()
	{
		return this.state == ActionState.finished;
	}
	
	/**
	 * To do.
	 */
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
	
	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public ActionState getState()
	{
		return this.state;
	}
	
	/**
	 * Sets the msg.
	 *
	 * @param msg the new msg
	 */
	public void setMsg(String msg)
	{
		this.msg = msg;
	}
}
