package action;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Scheduling.
 */
public abstract class Scheduling extends Action 
{
	
	/** The current action index. */
	protected int currentActionIndex;
	
	/** The actions. */
	protected List<Action> theActions;
	
	/**
	 * Instantiates a new scheduling.
	 */
	public Scheduling()
	{
		super();
		this.currentActionIndex = 0;
		this.theActions = new ArrayList<Action>();
	}
	
	/**
	 * Add an action to the actions of the scheduling.
	 *
	 * @param a the action to add
	 */
	public void add(Action a)
	{
		this.theActions.add(a);
	}
	
	/**
	 * Previous index.
	 *
	 * @return the previous index
	 */
	public int previous()
	{
		if (this.currentActionIndex == 0)
			return this.theActions.size() - 1;
		
		return this.currentActionIndex - 1;
	}
	
	/**
	 * Next index.
	 *
	 * @return the next index
	 */
	public int next()
	{
		if (this.currentActionIndex == this.theActions.size() - 1)
			return 0;
		
		return this.currentActionIndex +1;
	}
	
	/**
	 * Sets the current action index.
	 *
	 * @param newIndex the new current action index
	 */
	public void setCurrentActionIndex(int newIndex)
	{
		this.currentActionIndex = newIndex;
	}
	
	/**
	 * Increment index.
	 */
	public void incrementIndex()
	{
		this.setCurrentActionIndex(this.next());
	}
	
	/**
	 * Decrement index.
	 */
	public void decrementIndex()
	{
		this.setCurrentActionIndex(this.previous());
	}
	
	@Override
	protected boolean stopCondition() 
	{
		return this.theActions.isEmpty();
	}
}
