package action;

import ressource.RessourceManager;
import ressource.RessourceUser;

public abstract class RessourceAction<R> extends Action 
{

	protected RessourceManager<R> manager;
	protected RessourceUser<R> user;
	protected boolean canStop;
	
	public RessourceAction(String msg,RessourceManager<R> manager, RessourceUser<R> user)
	{
		super(msg);
		this.manager = manager;
		this.user = user;
		this.canStop = false;
	}
}
