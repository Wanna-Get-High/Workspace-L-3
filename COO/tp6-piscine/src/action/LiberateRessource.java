package action;

import ressource.RessourceManager;
import ressource.RessourceUser;

public class LiberateRessource<R> extends RessourceAction<R> 
{
	public LiberateRessource(String msg, RessourceManager<R> manager,RessourceUser<R> user) 
	{
		super(msg, manager, user);
	}

	@Override
	public void inToDo() 
	{
		if (user.getRessource() != null)
		{
			this.manager.libRessource(user.getRessource());
			this.canStop = true;
		}
		else 
			System.out.println("inToDo -> liberateRess -> user ress == null");
	}

	@Override
	protected boolean stopCondition() 
	{
		return this.canStop;
	}
}
