package action;

import ressource.*;

/**
 * The Class LiberateRessource.
 *
 * @param <R> the generic type
 */
public class LiberateResource<R extends Resource> extends ResourceAction<R> 
{
	
	/**
	 * Instantiates a new liberate resource.
	 *
	 * @param msg the message
	 * @param manager the resource manager
	 * @param user the resource user
	 */
	public LiberateResource(String msg, ResourceManager<R> manager,ResourceUser<R> user) 
	{
		super(msg, manager, user);
	}

	@Override
	public void inToDo()
	{
		if (user.getResource() != null)
		{
			this.manager.libRessource(user.getResource());
			this.canStop = true;
		}
		System.out.print(this.msg);
	}

	@Override
	protected boolean stopCondition() 
	{
		return this.canStop;
	}
}
