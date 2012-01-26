package action;

import java.util.NoSuchElementException;

import ressource.*;

/**
 * The Class TakeResource.
 *
 * @param <R> the generic type of resource
 */
public class TakeResource<R extends Resource> extends ResourceAction<R>
{
	
	/**
	 * Instantiates a new take resource.
	 *
	 * @param msg the message
	 * @param manager the resource manager
	 * @param user the resource user
	 */
	public TakeResource(String msg, ResourceManager<R> manager,ResourceUser<R> user)
	{
		super(msg, manager, user);
	}

	@Override
	public void inToDo()
	{
		R res;
		try{
			res = this.manager.giveRessource();
			this.user.setResource(res);
			this.canStop = true;
			System.out.println(this.msg);
		} 
		catch(NoSuchElementException e)
		{
			System.out.print(" - no ressource available \n");
		}
	}

	@Override
	protected boolean stopCondition() 
	{
		return this.canStop;
	}
}
