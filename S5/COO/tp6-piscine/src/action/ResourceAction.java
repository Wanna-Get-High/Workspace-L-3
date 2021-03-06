package action;

import ressource.ResourceManager;
import ressource.ResourceUser;

/**
 * The Class ResourceAction.
 *
 * @param <R> the generic type
 */
public abstract class ResourceAction<R> extends Action 
{

	/** The manager. */
	protected ResourceManager<R> manager;
	
	/** The user. */
	protected ResourceUser<R> user;
	
	/** the boolean to check if this action can be stopped. */
	protected boolean canStop;
	
	/**
	 * Instantiates a new resource action.
	 *
	 * @param msg the message
	 * @param manager the manager
	 * @param user the user
	 */
	public ResourceAction(String msg,ResourceManager<R> manager, ResourceUser<R> user)
	{
		super(msg);
		this.manager = manager;
		this.user = user;
		this.canStop = false;
	}
}
