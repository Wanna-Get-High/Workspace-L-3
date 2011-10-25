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
	
	@Override
	public void toDo() 
	{
		for (Action a :theAction)
			a.toDo();
	}
	
	@Override
	protected boolean stopCondition() 
	{
		return this.theAction.isEmpty();
	}

}