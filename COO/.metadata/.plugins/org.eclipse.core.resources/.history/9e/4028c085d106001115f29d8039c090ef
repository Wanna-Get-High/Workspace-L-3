package action;

import java.util.ArrayList;
import java.util.List;

public abstract class Scheduling extends Action 
{
	protected int currentActionIndex;
	protected List<Action> theAction;
	
	public Scheduling()
	{
		super();
		this.currentActionIndex = 0;
		this.theAction = new ArrayList<Action>();
	}
	
	public void add(Action a)
	{
		this.theAction.add(a);
	}
	
	public int previous()
	{
		if (this.currentActionIndex == 0)
			return this.theAction.size() - 1;
		
		return this.currentActionIndex - 1;
	}
	
	public int next()
	{
		if (this.currentActionIndex == this.theAction.size() - 1)
			return 0;
		
		return this.currentActionIndex +1;
	}
	
	public void setCurrentActionIndex(int newIndex)
	{
		this.currentActionIndex = newIndex;
	}
	
	public void incrementIndex()
	{
		this.setCurrentActionIndex(this.next());
	}
	
	public void decrementIndex()
	{
		this.setCurrentActionIndex(this.previous());
	}
	
	@Override
	protected boolean stopCondition() 
	{
		return this.theAction.isEmpty();
	}
}
